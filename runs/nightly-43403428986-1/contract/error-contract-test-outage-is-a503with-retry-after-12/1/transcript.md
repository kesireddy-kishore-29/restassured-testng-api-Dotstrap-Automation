# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-645c778e-9427-46da-8a66-1f8299608b99` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-9f81a442-7570-45af-8903-f3c2d29a47b5` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-01248bb5-72cd-411a-bda0-6830c4aaec27` |
| 4 | `POST /v1/conversations` | 201 | 27 | `qa-20f79d90-06d3-4ee3-9876-fefa0d7eaa9e` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 11 | `qa-d9746f70-78ff-4993-ad6b-982b2fb2324e` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-8420aa10-5e6c-4b7a-b900-d8a7f9c57c57` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-78770b75-2545-4a78-bfe6-f661cdb08fc1` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-1d8f4a5f-ad59-47f0-bd9b-408a03f3492c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-730ddacc-96e6-4642-a06c-ddf3111f0177` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-8331ea21-f3e5-4af8-84f8-b6e624a77797` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-645c778e-9427-46da-8a66-1f8299608b99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-645c778e-9427-46da-8a66-1f8299608b99
Content-Type: application/json

--- request body ---
{"handle":"qa-55e4faca7768","displayName":"QA 55e4faca7768","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-645c778e-9427-46da-8a66-1f8299608b99
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 7
Location: /v1/accounts/qa-55e4faca7768
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d8dc79d4-721d-4552-a8f4-fd0246a89e5d","handle":"qa-55e4faca7768","displayName":"QA 55e4faca7768","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.884369706Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9f81a442-7570-45af-8903-f3c2d29a47b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f81a442-7570-45af-8903-f3c2d29a47b5
Content-Type: application/json

--- request body ---
{"handle":"qa-7acf89aebc57","displayName":"QA 7acf89aebc57","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f81a442-7570-45af-8903-f3c2d29a47b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 7
Location: /v1/accounts/qa-7acf89aebc57
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3b96ed81-f004-404d-a933-41eacf86a5ee","handle":"qa-7acf89aebc57","displayName":"QA 7acf89aebc57","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.954843940Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-01248bb5-72cd-411a-bda0-6830c4aaec27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01248bb5-72cd-411a-bda0-6830c4aaec27
Content-Type: application/json

--- request body ---
{"handle":"qa-55e4faca7768","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-01248bb5-72cd-411a-bda0-6830c4aaec27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d8dc79d4-721d-4552-a8f4-fd0246a89e5d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-20f79d90-06d3-4ee3-9876-fefa0d7eaa9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20f79d90-06d3-4ee3-9876-fefa0d7eaa9e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7acf89aebc57","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-20f79d90-06d3-4ee3-9876-fefa0d7eaa9e
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
Location: /v1/conversations/cnv_b3a51930-738f-4676-b11f-dd124fb66133
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b3a51930-738f-4676-b11f-dd124fb66133","subject":"Error contract","status":"open","region":"eu","participants":["qa-55e4faca7768","qa-7acf89aebc57"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:08.009938835Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_b3a51930-738f-4676-b11f-dd124fb66133/close
correlation: qa-d9746f70-78ff-4993-ad6b-982b2fb2324e

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 0f81c4a0-8d4c-4f42-b052-b600c3e8791a
X-Correlation-Id: qa-d9746f70-78ff-4993-ad6b-982b2fb2324e
Content-Type: application/json

--- response: 503 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d9746f70-78ff-4993-ad6b-982b2fb2324e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_b3a51930-738f-4676-b11f-dd124fb66133/close","correlationId":"qa-d9746f70-78ff-4993-ad6b-982b2fb2324e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8420aa10-5e6c-4b7a-b900-d8a7f9c57c57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8420aa10-5e6c-4b7a-b900-d8a7f9c57c57
Content-Type: application/json

--- request body ---
{"handle":"qa-7acf89aebc57","password":"****"}

--- response: 200 in 33 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-8420aa10-5e6c-4b7a-b900-d8a7f9c57c57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3b96ed81-f004-404d-a933-41eacf86a5ee"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-78770b75-2545-4a78-bfe6-f661cdb08fc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78770b75-2545-4a78-bfe6-f661cdb08fc1
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-78770b75-2545-4a78-bfe6-f661cdb08fc1
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
correlation: qa-1d8f4a5f-ad59-47f0-bd9b-408a03f3492c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d8f4a5f-ad59-47f0-bd9b-408a03f3492c
Content-Type: application/json

--- request body ---
{"handle":"qa-7acf89aebc57","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d8f4a5f-ad59-47f0-bd9b-408a03f3492c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1d8f4a5f-ad59-47f0-bd9b-408a03f3492c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-730ddacc-96e6-4642-a06c-ddf3111f0177

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-730ddacc-96e6-4642-a06c-ddf3111f0177
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-730ddacc-96e6-4642-a06c-ddf3111f0177
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
correlation: qa-8331ea21-f3e5-4af8-84f8-b6e624a77797

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8331ea21-f3e5-4af8-84f8-b6e624a77797
Content-Type: application/json

--- request body ---
{"handle":"qa-55e4faca7768","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8331ea21-f3e5-4af8-84f8-b6e624a77797
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8331ea21-f3e5-4af8-84f8-b6e624a77797"}
```
