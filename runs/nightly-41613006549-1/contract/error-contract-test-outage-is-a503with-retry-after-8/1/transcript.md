# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-49de1413-dbab-4eee-9236-25e164ef693b` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-4f696725-829c-4e21-9bea-d8aae6c3368b` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-ec0c0d82-822d-498f-8844-057d74e44252` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-663d2292-0861-4cfe-a466-39f71b47da31` |
| 5 | `GET /v1/conversations/{id}` | 503 | 10 | `qa-11c3b4cd-f82c-47d0-b573-1993e222e37e` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-91fc2c6f-5602-4808-96ae-349ea0bfe747` |
| 7 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-f0a4bae8-9a79-4a03-a938-60509fb0796a` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-6fd3502b-191a-4ed4-9cf9-17f7071ea0a0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-6b7648ec-21c6-473b-af79-42c0155e7a1c` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-cb8dae8c-26d7-4d13-99db-5e195b1f9fca` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-49de1413-dbab-4eee-9236-25e164ef693b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49de1413-dbab-4eee-9236-25e164ef693b
Content-Type: application/json

--- request body ---
{"handle":"qa-576b71bf1d36","displayName":"QA 576b71bf1d36","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-49de1413-dbab-4eee-9236-25e164ef693b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 9
Location: /v1/accounts/qa-576b71bf1d36
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c76f914f-7f56-4897-aa26-e766e776b57e","handle":"qa-576b71bf1d36","displayName":"QA 576b71bf1d36","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.703240255Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4f696725-829c-4e21-9bea-d8aae6c3368b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f696725-829c-4e21-9bea-d8aae6c3368b
Content-Type: application/json

--- request body ---
{"handle":"qa-538b8f41bcdf","displayName":"QA 538b8f41bcdf","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f696725-829c-4e21-9bea-d8aae6c3368b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 9
Location: /v1/accounts/qa-538b8f41bcdf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9bbbf613-b87b-4d86-af96-f0e04f416b9e","handle":"qa-538b8f41bcdf","displayName":"QA 538b8f41bcdf","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.734262960Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ec0c0d82-822d-498f-8844-057d74e44252

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec0c0d82-822d-498f-8844-057d74e44252
Content-Type: application/json

--- request body ---
{"handle":"qa-576b71bf1d36","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec0c0d82-822d-498f-8844-057d74e44252
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c76f914f-7f56-4897-aa26-e766e776b57e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-663d2292-0861-4cfe-a466-39f71b47da31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-663d2292-0861-4cfe-a466-39f71b47da31
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-538b8f41bcdf","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-663d2292-0861-4cfe-a466-39f71b47da31
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
Location: /v1/conversations/cnv_ec9a7cf5-5f9b-4aa8-9540-dfcf6237f283
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ec9a7cf5-5f9b-4aa8-9540-dfcf6237f283","subject":"Error contract","status":"open","region":"eu","participants":["qa-576b71bf1d36","qa-538b8f41bcdf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:32.784532830Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_ec9a7cf5-5f9b-4aa8-9540-dfcf6237f283
correlation: qa-11c3b4cd-f82c-47d0-b573-1993e222e37e

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 08a81d2b-b5b2-4e0d-9a7e-b15330fb2545
X-Correlation-Id: qa-11c3b4cd-f82c-47d0-b573-1993e222e37e
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-11c3b4cd-f82c-47d0-b573-1993e222e37e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_ec9a7cf5-5f9b-4aa8-9540-dfcf6237f283","correlationId":"qa-11c3b4cd-f82c-47d0-b573-1993e222e37e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-91fc2c6f-5602-4808-96ae-349ea0bfe747

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91fc2c6f-5602-4808-96ae-349ea0bfe747
Content-Type: application/json

--- request body ---
{"handle":"qa-538b8f41bcdf","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-91fc2c6f-5602-4808-96ae-349ea0bfe747
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9bbbf613-b87b-4d86-af96-f0e04f416b9e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f0a4bae8-9a79-4a03-a938-60509fb0796a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0a4bae8-9a79-4a03-a938-60509fb0796a
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f0a4bae8-9a79-4a03-a938-60509fb0796a
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
correlation: qa-6fd3502b-191a-4ed4-9cf9-17f7071ea0a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fd3502b-191a-4ed4-9cf9-17f7071ea0a0
Content-Type: application/json

--- request body ---
{"handle":"qa-538b8f41bcdf","password":"****"}

--- response: 401 in 19 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6fd3502b-191a-4ed4-9cf9-17f7071ea0a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6fd3502b-191a-4ed4-9cf9-17f7071ea0a0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6b7648ec-21c6-473b-af79-42c0155e7a1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b7648ec-21c6-473b-af79-42c0155e7a1c
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6b7648ec-21c6-473b-af79-42c0155e7a1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-cb8dae8c-26d7-4d13-99db-5e195b1f9fca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb8dae8c-26d7-4d13-99db-5e195b1f9fca
Content-Type: application/json

--- request body ---
{"handle":"qa-576b71bf1d36","password":"****"}

--- response: 401 in 25 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb8dae8c-26d7-4d13-99db-5e195b1f9fca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cb8dae8c-26d7-4d13-99db-5e195b1f9fca"}
```
