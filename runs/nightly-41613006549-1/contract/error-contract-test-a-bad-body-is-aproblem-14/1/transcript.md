# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-b257525b-a002-4b9c-b51a-a7cd4d123025` |
| 2 | `POST /v1/accounts` | 201 | 9 | `qa-fdfb178b-eb2b-4c63-bcf9-51087d22d8a5` |
| 3 | `POST /v1/auth/token` | 200 | 10 | `qa-9d15130f-62ca-498a-a481-5f9dcee7bcb1` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-8aec7299-663c-4848-b31e-03d61658500d` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 11 | `qa-e9e1add2-7dda-4444-bd75-61dedb3357e4` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-9be775eb-248a-4e9e-9f4d-2d32f0930655` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-21f77d3d-e68e-4713-b3c1-f1a9909312d7` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-c88dcfca-dd1e-4222-9d40-9f0016fb0411` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-f488b354-c5cb-448b-b872-d4f1c483cec4` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-4295ee83-2e60-47ce-b3a6-2a5b6c6dd086` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b257525b-a002-4b9c-b51a-a7cd4d123025

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b257525b-a002-4b9c-b51a-a7cd4d123025
Content-Type: application/json

--- request body ---
{"handle":"qa-ffc1ca236744","displayName":"QA ffc1ca236744","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-b257525b-a002-4b9c-b51a-a7cd4d123025
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 8
Location: /v1/accounts/qa-ffc1ca236744
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eab1d6cd-26dd-40a4-a343-e7f5d09601fd","handle":"qa-ffc1ca236744","displayName":"QA ffc1ca236744","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.114083161Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fdfb178b-eb2b-4c63-bcf9-51087d22d8a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdfb178b-eb2b-4c63-bcf9-51087d22d8a5
Content-Type: application/json

--- request body ---
{"handle":"qa-e9acc0fedce1","displayName":"QA e9acc0fedce1","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdfb178b-eb2b-4c63-bcf9-51087d22d8a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 8
Location: /v1/accounts/qa-e9acc0fedce1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_efffeb23-04a7-44e0-9c4a-774e57d697fe","handle":"qa-e9acc0fedce1","displayName":"QA e9acc0fedce1","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.147494214Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9d15130f-62ca-498a-a481-5f9dcee7bcb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d15130f-62ca-498a-a481-5f9dcee7bcb1
Content-Type: application/json

--- request body ---
{"handle":"qa-ffc1ca236744","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d15130f-62ca-498a-a481-5f9dcee7bcb1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eab1d6cd-26dd-40a4-a343-e7f5d09601fd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8aec7299-663c-4848-b31e-03d61658500d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8aec7299-663c-4848-b31e-03d61658500d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e9acc0fedce1","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-8aec7299-663c-4848-b31e-03d61658500d
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
Location: /v1/conversations/cnv_e33b85e6-fa69-4f35-b705-44b99792be83
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e33b85e6-fa69-4f35-b705-44b99792be83","subject":"Error contract","status":"open","region":"eu","participants":["qa-ffc1ca236744","qa-e9acc0fedce1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:33.191314789Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_e33b85e6-fa69-4f35-b705-44b99792be83/messages
correlation: qa-e9e1add2-7dda-4444-bd75-61dedb3357e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9e1add2-7dda-4444-bd75-61dedb3357e4
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9e1add2-7dda-4444-bd75-61dedb3357e4
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_e33b85e6-fa69-4f35-b705-44b99792be83/messages","correlationId":"qa-e9e1add2-7dda-4444-bd75-61dedb3357e4","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9be775eb-248a-4e9e-9f4d-2d32f0930655

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9be775eb-248a-4e9e-9f4d-2d32f0930655
Content-Type: application/json

--- request body ---
{"handle":"qa-e9acc0fedce1","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-9be775eb-248a-4e9e-9f4d-2d32f0930655
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_efffeb23-04a7-44e0-9c4a-774e57d697fe"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-21f77d3d-e68e-4713-b3c1-f1a9909312d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21f77d3d-e68e-4713-b3c1-f1a9909312d7
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-21f77d3d-e68e-4713-b3c1-f1a9909312d7
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
correlation: qa-c88dcfca-dd1e-4222-9d40-9f0016fb0411

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c88dcfca-dd1e-4222-9d40-9f0016fb0411
Content-Type: application/json

--- request body ---
{"handle":"qa-e9acc0fedce1","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c88dcfca-dd1e-4222-9d40-9f0016fb0411
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c88dcfca-dd1e-4222-9d40-9f0016fb0411"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f488b354-c5cb-448b-b872-d4f1c483cec4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f488b354-c5cb-448b-b872-d4f1c483cec4
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f488b354-c5cb-448b-b872-d4f1c483cec4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-4295ee83-2e60-47ce-b3a6-2a5b6c6dd086

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4295ee83-2e60-47ce-b3a6-2a5b6c6dd086
Content-Type: application/json

--- request body ---
{"handle":"qa-ffc1ca236744","password":"****"}

--- response: 401 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4295ee83-2e60-47ce-b3a6-2a5b6c6dd086
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4295ee83-2e60-47ce-b3a6-2a5b6c6dd086"}
```
