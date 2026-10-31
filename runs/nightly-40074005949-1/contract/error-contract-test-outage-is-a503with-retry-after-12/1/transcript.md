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
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-c6a4b87c-5ec7-4407-a638-47bbc82eb79a` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-43daee98-9871-4419-9f4c-20efc859555d` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-737f79aa-31cf-4be7-a133-f78bdf4cbf42` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-c4259671-11d7-4c45-b4c3-bf0a38d3b78b` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 25 | `qa-0e77f086-af33-48eb-965f-411cc67995fe` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-86d30cae-7e30-43c2-b7f7-93455a5d7863` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-11bcf79e-25f7-4114-b1f6-8cfeeae01630` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-f58acd2d-d1c3-4fa8-b5b1-bff7cb0bc08a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-23cf40c4-81d6-46a9-bfda-5ac1dd615c57` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-e09a6f0b-38f4-48e2-a350-a98b4f3b16b4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c6a4b87c-5ec7-4407-a638-47bbc82eb79a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6a4b87c-5ec7-4407-a638-47bbc82eb79a
Content-Type: application/json

--- request body ---
{"handle":"qa-6f5a7f400a4b","displayName":"QA 6f5a7f400a4b","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6a4b87c-5ec7-4407-a638-47bbc82eb79a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 8
Location: /v1/accounts/qa-6f5a7f400a4b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_575e5486-b819-45b5-bef6-bc8b02dd37e2","handle":"qa-6f5a7f400a4b","displayName":"QA 6f5a7f400a4b","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.615516985Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-43daee98-9871-4419-9f4c-20efc859555d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43daee98-9871-4419-9f4c-20efc859555d
Content-Type: application/json

--- request body ---
{"handle":"qa-71ad1ea2d671","displayName":"QA 71ad1ea2d671","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-43daee98-9871-4419-9f4c-20efc859555d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 8
Location: /v1/accounts/qa-71ad1ea2d671
X-Served-Region: eu
Content-Length: 181

{"id":"acc_31ba8722-000b-41f0-8de2-402e8d01e1f4","handle":"qa-71ad1ea2d671","displayName":"QA 71ad1ea2d671","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.652412474Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-737f79aa-31cf-4be7-a133-f78bdf4cbf42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-737f79aa-31cf-4be7-a133-f78bdf4cbf42
Content-Type: application/json

--- request body ---
{"handle":"qa-6f5a7f400a4b","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-737f79aa-31cf-4be7-a133-f78bdf4cbf42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_575e5486-b819-45b5-bef6-bc8b02dd37e2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c4259671-11d7-4c45-b4c3-bf0a38d3b78b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4259671-11d7-4c45-b4c3-bf0a38d3b78b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-71ad1ea2d671","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4259671-11d7-4c45-b4c3-bf0a38d3b78b
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
Location: /v1/conversations/cnv_ea19246d-7517-43a9-b78d-64a0e756fe20
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ea19246d-7517-43a9-b78d-64a0e756fe20","subject":"Error contract","status":"open","region":"eu","participants":["qa-6f5a7f400a4b","qa-71ad1ea2d671"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.715854075Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_ea19246d-7517-43a9-b78d-64a0e756fe20/close
correlation: qa-0e77f086-af33-48eb-965f-411cc67995fe

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 1aff4bec-8dbc-4b9a-b999-8dc319c3fba9
X-Correlation-Id: qa-0e77f086-af33-48eb-965f-411cc67995fe
Content-Type: application/json

--- response: 503 in 25 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e77f086-af33-48eb-965f-411cc67995fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_ea19246d-7517-43a9-b78d-64a0e756fe20/close","correlationId":"qa-0e77f086-af33-48eb-965f-411cc67995fe"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-86d30cae-7e30-43c2-b7f7-93455a5d7863

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86d30cae-7e30-43c2-b7f7-93455a5d7863
Content-Type: application/json

--- request body ---
{"handle":"qa-71ad1ea2d671","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-86d30cae-7e30-43c2-b7f7-93455a5d7863
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_31ba8722-000b-41f0-8de2-402e8d01e1f4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-11bcf79e-25f7-4114-b1f6-8cfeeae01630

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11bcf79e-25f7-4114-b1f6-8cfeeae01630
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-11bcf79e-25f7-4114-b1f6-8cfeeae01630
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
correlation: qa-f58acd2d-d1c3-4fa8-b5b1-bff7cb0bc08a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f58acd2d-d1c3-4fa8-b5b1-bff7cb0bc08a
Content-Type: application/json

--- request body ---
{"handle":"qa-71ad1ea2d671","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f58acd2d-d1c3-4fa8-b5b1-bff7cb0bc08a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f58acd2d-d1c3-4fa8-b5b1-bff7cb0bc08a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-23cf40c4-81d6-46a9-bfda-5ac1dd615c57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23cf40c4-81d6-46a9-bfda-5ac1dd615c57
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-23cf40c4-81d6-46a9-bfda-5ac1dd615c57
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
correlation: qa-e09a6f0b-38f4-48e2-a350-a98b4f3b16b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e09a6f0b-38f4-48e2-a350-a98b4f3b16b4
Content-Type: application/json

--- request body ---
{"handle":"qa-6f5a7f400a4b","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e09a6f0b-38f4-48e2-a350-a98b4f3b16b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e09a6f0b-38f4-48e2-a350-a98b4f3b16b4"}
```
