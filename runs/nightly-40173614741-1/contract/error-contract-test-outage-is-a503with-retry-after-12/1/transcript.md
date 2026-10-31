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
| 1 | `POST /v1/accounts` | 201 | 83 | `qa-f450f2ca-a49a-4032-88e6-eb87fbbe0614` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-c16da247-eab5-4afc-9164-33a2ff79cdc7` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-e3b4d619-8d6a-419c-8552-e9169383cd71` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-c1ea356d-8734-4642-b323-edb02e936125` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 23 | `qa-dac28fef-3ac2-4230-a0cf-93ba8eb55b5b` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-974a1407-b14b-4e67-be0d-fd0fde33d104` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-783a5ca5-84c5-4c17-9a6b-ddc5982ac5f2` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-c2926253-bdd2-48b4-9247-1803af8aba59` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-661b5b8c-e1c6-4705-b247-111f547f035e` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-4644e9b8-224d-4010-ac6f-35e9d6caa6e4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f450f2ca-a49a-4032-88e6-eb87fbbe0614

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f450f2ca-a49a-4032-88e6-eb87fbbe0614
Content-Type: application/json

--- request body ---
{"handle":"qa-d6fbd6c2904b","displayName":"QA d6fbd6c2904b","password":"****","region":"eu"}

--- response: 201 in 83 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-f450f2ca-a49a-4032-88e6-eb87fbbe0614
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 7
Location: /v1/accounts/qa-d6fbd6c2904b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c4905f09-981d-45db-9c9a-ffd4aa5829b6","handle":"qa-d6fbd6c2904b","displayName":"QA d6fbd6c2904b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.572844173Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c16da247-eab5-4afc-9164-33a2ff79cdc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c16da247-eab5-4afc-9164-33a2ff79cdc7
Content-Type: application/json

--- request body ---
{"handle":"qa-06901b8412b2","displayName":"QA 06901b8412b2","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c16da247-eab5-4afc-9164-33a2ff79cdc7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 7
Location: /v1/accounts/qa-06901b8412b2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_948eaf40-90ed-4ea0-93dc-06c33e3dca40","handle":"qa-06901b8412b2","displayName":"QA 06901b8412b2","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.604910192Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e3b4d619-8d6a-419c-8552-e9169383cd71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3b4d619-8d6a-419c-8552-e9169383cd71
Content-Type: application/json

--- request body ---
{"handle":"qa-d6fbd6c2904b","password":"****"}

--- response: 200 in 31 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3b4d619-8d6a-419c-8552-e9169383cd71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c4905f09-981d-45db-9c9a-ffd4aa5829b6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c1ea356d-8734-4642-b323-edb02e936125

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1ea356d-8734-4642-b323-edb02e936125
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-06901b8412b2","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1ea356d-8734-4642-b323-edb02e936125
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
Location: /v1/conversations/cnv_2f9b7976-9d82-44fd-90d8-1f5d56f834fd
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2f9b7976-9d82-44fd-90d8-1f5d56f834fd","subject":"Error contract","status":"open","region":"eu","participants":["qa-d6fbd6c2904b","qa-06901b8412b2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.681830050Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_2f9b7976-9d82-44fd-90d8-1f5d56f834fd/close
correlation: qa-dac28fef-3ac2-4230-a0cf-93ba8eb55b5b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 11b6236d-c6aa-4962-9678-f0e459345f7d
X-Correlation-Id: qa-dac28fef-3ac2-4230-a0cf-93ba8eb55b5b
Content-Type: application/json

--- response: 503 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dac28fef-3ac2-4230-a0cf-93ba8eb55b5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_2f9b7976-9d82-44fd-90d8-1f5d56f834fd/close","correlationId":"qa-dac28fef-3ac2-4230-a0cf-93ba8eb55b5b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-974a1407-b14b-4e67-be0d-fd0fde33d104

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-974a1407-b14b-4e67-be0d-fd0fde33d104
Content-Type: application/json

--- request body ---
{"handle":"qa-06901b8412b2","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-974a1407-b14b-4e67-be0d-fd0fde33d104
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_948eaf40-90ed-4ea0-93dc-06c33e3dca40"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-783a5ca5-84c5-4c17-9a6b-ddc5982ac5f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-783a5ca5-84c5-4c17-9a6b-ddc5982ac5f2
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-783a5ca5-84c5-4c17-9a6b-ddc5982ac5f2
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
correlation: qa-c2926253-bdd2-48b4-9247-1803af8aba59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2926253-bdd2-48b4-9247-1803af8aba59
Content-Type: application/json

--- request body ---
{"handle":"qa-06901b8412b2","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c2926253-bdd2-48b4-9247-1803af8aba59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c2926253-bdd2-48b4-9247-1803af8aba59"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-661b5b8c-e1c6-4705-b247-111f547f035e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-661b5b8c-e1c6-4705-b247-111f547f035e
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-661b5b8c-e1c6-4705-b247-111f547f035e
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
correlation: qa-4644e9b8-224d-4010-ac6f-35e9d6caa6e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4644e9b8-224d-4010-ac6f-35e9d6caa6e4
Content-Type: application/json

--- request body ---
{"handle":"qa-d6fbd6c2904b","password":"****"}

--- response: 401 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4644e9b8-224d-4010-ac6f-35e9d6caa6e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4644e9b8-224d-4010-ac6f-35e9d6caa6e4"}
```
