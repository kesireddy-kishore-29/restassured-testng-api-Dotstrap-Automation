# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-bb81009a-e2aa-4836-bef0-04a91e291e58` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-dd519ab8-df61-4ccb-a06a-a90a6a8c4cf0` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-93452378-77d6-40a1-9096-cf3e0abe45ac` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-a15e3714-9386-4b6f-97a0-cdaa165ea715` |
| 5 | `PATCH /v1/accounts/me` | 503 | 9 | `qa-0a7433cc-1073-429b-ae35-8d8194cadc23` |
| 6 | `POST /v1/auth/token` | 200 | 55 | `qa-ac6bcce1-9642-4b52-b7da-2cb0664fc28a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-a8681591-eedb-4c4f-9b53-63d1fc53b949` |
| 8 | `POST /v1/auth/token` | 401 | 4 | `qa-250a3a54-3e5c-4241-8e0e-ab0b3c694423` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-cf9fb757-78e6-4759-8ebb-501f79d75247` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-e1c7408f-1caa-4d30-b26c-5ec7e3e97c8e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bb81009a-e2aa-4836-bef0-04a91e291e58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb81009a-e2aa-4836-bef0-04a91e291e58
Content-Type: application/json

--- request body ---
{"handle":"qa-5bb7265cef7a","displayName":"QA 5bb7265cef7a","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb81009a-e2aa-4836-bef0-04a91e291e58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Location: /v1/accounts/qa-5bb7265cef7a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a2b950ff-9f11-430f-9fd1-3275b6020179","handle":"qa-5bb7265cef7a","displayName":"QA 5bb7265cef7a","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.626070809Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dd519ab8-df61-4ccb-a06a-a90a6a8c4cf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd519ab8-df61-4ccb-a06a-a90a6a8c4cf0
Content-Type: application/json

--- request body ---
{"handle":"qa-9b908023dd7c","displayName":"QA 9b908023dd7c","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd519ab8-df61-4ccb-a06a-a90a6a8c4cf0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Location: /v1/accounts/qa-9b908023dd7c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e798b25f-1f07-4d98-bf50-6557c62e9c61","handle":"qa-9b908023dd7c","displayName":"QA 9b908023dd7c","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.650535677Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-93452378-77d6-40a1-9096-cf3e0abe45ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93452378-77d6-40a1-9096-cf3e0abe45ac
Content-Type: application/json

--- request body ---
{"handle":"qa-5bb7265cef7a","password":"****"}

--- response: 200 in 38 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-93452378-77d6-40a1-9096-cf3e0abe45ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a2b950ff-9f11-430f-9fd1-3275b6020179"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a15e3714-9386-4b6f-97a0-cdaa165ea715

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a15e3714-9386-4b6f-97a0-cdaa165ea715
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9b908023dd7c","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-a15e3714-9386-4b6f-97a0-cdaa165ea715
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_ebc4acfa-88fc-48a5-aa92-252548081d8b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ebc4acfa-88fc-48a5-aa92-252548081d8b","subject":"Error contract","status":"open","region":"eu","participants":["qa-5bb7265cef7a","qa-9b908023dd7c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:17.719860022Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-0a7433cc-1073-429b-ae35-8d8194cadc23

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 7982694d-d99e-4697-ac3e-bf3d59072890
X-Correlation-Id: qa-0a7433cc-1073-429b-ae35-8d8194cadc23
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0a7433cc-1073-429b-ae35-8d8194cadc23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-0a7433cc-1073-429b-ae35-8d8194cadc23"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ac6bcce1-9642-4b52-b7da-2cb0664fc28a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac6bcce1-9642-4b52-b7da-2cb0664fc28a
Content-Type: application/json

--- request body ---
{"handle":"qa-9b908023dd7c","password":"****"}

--- response: 200 in 55 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac6bcce1-9642-4b52-b7da-2cb0664fc28a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e798b25f-1f07-4d98-bf50-6557c62e9c61"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a8681591-eedb-4c4f-9b53-63d1fc53b949

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8681591-eedb-4c4f-9b53-63d1fc53b949
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a8681591-eedb-4c4f-9b53-63d1fc53b949
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-250a3a54-3e5c-4241-8e0e-ab0b3c694423

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-250a3a54-3e5c-4241-8e0e-ab0b3c694423
Content-Type: application/json

--- request body ---
{"handle":"qa-9b908023dd7c","password":"****"}

--- response: 401 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-250a3a54-3e5c-4241-8e0e-ab0b3c694423
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-250a3a54-3e5c-4241-8e0e-ab0b3c694423"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cf9fb757-78e6-4759-8ebb-501f79d75247

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf9fb757-78e6-4759-8ebb-501f79d75247
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cf9fb757-78e6-4759-8ebb-501f79d75247
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e1c7408f-1caa-4d30-b26c-5ec7e3e97c8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1c7408f-1caa-4d30-b26c-5ec7e3e97c8e
Content-Type: application/json

--- request body ---
{"handle":"qa-5bb7265cef7a","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1c7408f-1caa-4d30-b26c-5ec7e3e97c8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e1c7408f-1caa-4d30-b26c-5ec7e3e97c8e"}
```
