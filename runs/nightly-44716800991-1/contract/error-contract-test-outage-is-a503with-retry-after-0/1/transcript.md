# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-23438e12-2e46-4b5b-9dfb-5285eb94569c` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-3f9900e9-ff0a-41be-ae1c-c22154ab897f` |
| 3 | `POST /v1/auth/token` | 200 | 49 | `qa-d8ff9af5-47c9-48a5-8882-658076f35dec` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-bb75afda-d879-499f-9004-0ceb0c694a1a` |
| 5 | `POST /v1/auth/token` | 503 | 13 | `qa-4039127a-0e27-40bc-94e9-5dc9d2b882e9` |
| 6 | `POST /v1/auth/token` | 200 | 88 | `qa-e98618d2-488c-4dc4-add8-f9f23049e818` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-e9ee6c4a-4b23-4039-bc73-6795ee3d3862` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-1962d856-462f-4d1f-87de-54b98ae8defb` |
| 9 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-4823b577-30cb-4fc8-8562-82cf3f7d3eb3` |
| 10 | `POST /v1/auth/token` | 401 | 63 | `qa-4a12f80a-cc4c-487c-82de-5ecd414591c4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-23438e12-2e46-4b5b-9dfb-5285eb94569c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23438e12-2e46-4b5b-9dfb-5285eb94569c
Content-Type: application/json

--- request body ---
{"handle":"qa-0942df9a788b","displayName":"QA 0942df9a788b","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-23438e12-2e46-4b5b-9dfb-5285eb94569c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-0942df9a788b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_230b1913-1bac-4f0e-b697-942a96f20736","handle":"qa-0942df9a788b","displayName":"QA 0942df9a788b","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.396371107Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3f9900e9-ff0a-41be-ae1c-c22154ab897f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f9900e9-ff0a-41be-ae1c-c22154ab897f
Content-Type: application/json

--- request body ---
{"handle":"qa-cd3bd7538909","displayName":"QA cd3bd7538909","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f9900e9-ff0a-41be-ae1c-c22154ab897f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Location: /v1/accounts/qa-cd3bd7538909
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1b1c5e28-a8f7-4489-8734-3f52654b499f","handle":"qa-cd3bd7538909","displayName":"QA cd3bd7538909","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.446671387Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d8ff9af5-47c9-48a5-8882-658076f35dec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8ff9af5-47c9-48a5-8882-658076f35dec
Content-Type: application/json

--- request body ---
{"handle":"qa-0942df9a788b","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8ff9af5-47c9-48a5-8882-658076f35dec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_230b1913-1bac-4f0e-b697-942a96f20736"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bb75afda-d879-499f-9004-0ceb0c694a1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb75afda-d879-499f-9004-0ceb0c694a1a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cd3bd7538909","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb75afda-d879-499f-9004-0ceb0c694a1a
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
Location: /v1/conversations/cnv_2ca392cd-5d0a-4291-ad42-6ad259b38cd6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2ca392cd-5d0a-4291-ad42-6ad259b38cd6","subject":"Error contract","status":"open","region":"eu","participants":["qa-0942df9a788b","qa-cd3bd7538909"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:00.608145379Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-4039127a-0e27-40bc-94e9-5dc9d2b882e9

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c29a6750-8a02-44d7-af2c-393eedb9a395
X-Correlation-Id: qa-4039127a-0e27-40bc-94e9-5dc9d2b882e9
Content-Type: application/json

--- request body ---
{"handle":"qa-0942df9a788b","password":"****"}

--- response: 503 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4039127a-0e27-40bc-94e9-5dc9d2b882e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-4039127a-0e27-40bc-94e9-5dc9d2b882e9"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e98618d2-488c-4dc4-add8-f9f23049e818

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e98618d2-488c-4dc4-add8-f9f23049e818
Content-Type: application/json

--- request body ---
{"handle":"qa-cd3bd7538909","password":"****"}

--- response: 200 in 88 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e98618d2-488c-4dc4-add8-f9f23049e818
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1b1c5e28-a8f7-4489-8734-3f52654b499f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e9ee6c4a-4b23-4039-bc73-6795ee3d3862

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9ee6c4a-4b23-4039-bc73-6795ee3d3862
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e9ee6c4a-4b23-4039-bc73-6795ee3d3862
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
correlation: qa-1962d856-462f-4d1f-87de-54b98ae8defb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1962d856-462f-4d1f-87de-54b98ae8defb
Content-Type: application/json

--- request body ---
{"handle":"qa-cd3bd7538909","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1962d856-462f-4d1f-87de-54b98ae8defb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1962d856-462f-4d1f-87de-54b98ae8defb"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4823b577-30cb-4fc8-8562-82cf3f7d3eb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4823b577-30cb-4fc8-8562-82cf3f7d3eb3
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4823b577-30cb-4fc8-8562-82cf3f7d3eb3
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
correlation: qa-4a12f80a-cc4c-487c-82de-5ecd414591c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a12f80a-cc4c-487c-82de-5ecd414591c4
Content-Type: application/json

--- request body ---
{"handle":"qa-0942df9a788b","password":"****"}

--- response: 401 in 63 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a12f80a-cc4c-487c-82de-5ecd414591c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4a12f80a-cc4c-487c-82de-5ecd414591c4"}
```
