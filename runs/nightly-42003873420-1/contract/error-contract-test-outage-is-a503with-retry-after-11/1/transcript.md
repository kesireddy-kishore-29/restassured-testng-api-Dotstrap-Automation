# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-0cca9a94-00b7-48ea-87a9-bc2b79e57dd6` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-dc78159c-d99b-443c-8d87-f3e2dc5d3193` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-b3536955-9c96-4c97-a153-1dda8ab7a882` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-df85427b-dff3-4105-a1b8-a15cbe71cdb2` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 43 | `qa-d9299581-3a78-49a9-879f-fb103af4b219` |
| 6 | `POST /v1/auth/token` | 200 | 58 | `qa-b2666f35-7582-4111-a3eb-babeb2855f3c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-0c3e3753-fb06-4bcd-b2ed-99cfe1c33d19` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-09787eba-b7d5-4d86-bd68-ca2b735729f2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-f8d225eb-a1bb-4fb7-8cef-6098a7fb8c4a` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-5226478b-0c12-44b3-a8a3-285ed3ee8248` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0cca9a94-00b7-48ea-87a9-bc2b79e57dd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cca9a94-00b7-48ea-87a9-bc2b79e57dd6
Content-Type: application/json

--- request body ---
{"handle":"qa-31321e12ca34","displayName":"QA 31321e12ca34","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-0cca9a94-00b7-48ea-87a9-bc2b79e57dd6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 7
Location: /v1/accounts/qa-31321e12ca34
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d545b381-7367-4ed6-a408-7e853b3f4fb6","handle":"qa-31321e12ca34","displayName":"QA 31321e12ca34","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.121720749Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dc78159c-d99b-443c-8d87-f3e2dc5d3193

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc78159c-d99b-443c-8d87-f3e2dc5d3193
Content-Type: application/json

--- request body ---
{"handle":"qa-d9379df44c67","displayName":"QA d9379df44c67","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc78159c-d99b-443c-8d87-f3e2dc5d3193
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 7
Location: /v1/accounts/qa-d9379df44c67
X-Served-Region: eu
Content-Length: 181

{"id":"acc_96a97e29-fd5f-4a90-ab1a-a9f0cb8d76d2","handle":"qa-d9379df44c67","displayName":"QA d9379df44c67","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.175033558Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b3536955-9c96-4c97-a153-1dda8ab7a882

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3536955-9c96-4c97-a153-1dda8ab7a882
Content-Type: application/json

--- request body ---
{"handle":"qa-31321e12ca34","password":"****"}

--- response: 200 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3536955-9c96-4c97-a153-1dda8ab7a882
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d545b381-7367-4ed6-a408-7e853b3f4fb6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-df85427b-dff3-4105-a1b8-a15cbe71cdb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df85427b-dff3-4105-a1b8-a15cbe71cdb2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d9379df44c67","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-df85427b-dff3-4105-a1b8-a15cbe71cdb2
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
Location: /v1/conversations/cnv_4ccf5c08-d7a8-47ca-a4b8-3ad82da30c3d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4ccf5c08-d7a8-47ca-a4b8-3ad82da30c3d","subject":"Error contract","status":"open","region":"eu","participants":["qa-31321e12ca34","qa-d9379df44c67"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:56.253369703Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_4ccf5c08-d7a8-47ca-a4b8-3ad82da30c3d/read
correlation: qa-d9299581-3a78-49a9-879f-fb103af4b219

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 7d640e74-1bfa-481a-ab00-f06626aaec54
X-Correlation-Id: qa-d9299581-3a78-49a9-879f-fb103af4b219
Content-Type: application/json

--- response: 503 in 43 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d9299581-3a78-49a9-879f-fb103af4b219
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_4ccf5c08-d7a8-47ca-a4b8-3ad82da30c3d/read","correlationId":"qa-d9299581-3a78-49a9-879f-fb103af4b219"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b2666f35-7582-4111-a3eb-babeb2855f3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2666f35-7582-4111-a3eb-babeb2855f3c
Content-Type: application/json

--- request body ---
{"handle":"qa-d9379df44c67","password":"****"}

--- response: 200 in 58 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2666f35-7582-4111-a3eb-babeb2855f3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_96a97e29-fd5f-4a90-ab1a-a9f0cb8d76d2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c3e3753-fb06-4bcd-b2ed-99cfe1c33d19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c3e3753-fb06-4bcd-b2ed-99cfe1c33d19
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c3e3753-fb06-4bcd-b2ed-99cfe1c33d19
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
correlation: qa-09787eba-b7d5-4d86-bd68-ca2b735729f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09787eba-b7d5-4d86-bd68-ca2b735729f2
Content-Type: application/json

--- request body ---
{"handle":"qa-d9379df44c67","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09787eba-b7d5-4d86-bd68-ca2b735729f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-09787eba-b7d5-4d86-bd68-ca2b735729f2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f8d225eb-a1bb-4fb7-8cef-6098a7fb8c4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8d225eb-a1bb-4fb7-8cef-6098a7fb8c4a
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f8d225eb-a1bb-4fb7-8cef-6098a7fb8c4a
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
correlation: qa-5226478b-0c12-44b3-a8a3-285ed3ee8248

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5226478b-0c12-44b3-a8a3-285ed3ee8248
Content-Type: application/json

--- request body ---
{"handle":"qa-31321e12ca34","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5226478b-0c12-44b3-a8a3-285ed3ee8248
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5226478b-0c12-44b3-a8a3-285ed3ee8248"}
```
