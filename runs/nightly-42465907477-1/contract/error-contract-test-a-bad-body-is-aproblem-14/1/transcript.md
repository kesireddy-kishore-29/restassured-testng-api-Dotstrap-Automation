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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-10ea18bf-7f65-4757-8d88-658f954293ac` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-bca960b0-2f42-4a2e-b9a9-58889d329b31` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-96b0df6a-8457-48c0-b41d-866e21537fbe` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-7baac14d-7ead-429f-bf87-1d7980928f3e` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 24 | `qa-c99dd133-44e6-404b-8196-d7584a1bc95c` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-86c682c3-8b46-48fd-9e4d-8607689dc1de` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-5f2f1eb5-db78-4e2d-b07c-7287ac9716fb` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-5734c0c8-da27-435e-bbe7-ea42da8eed47` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-c520a7e6-d9c7-4d39-b44f-70b88f1f7c51` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-bd52bfe2-87a5-4a72-b217-c9df2499c5e3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-10ea18bf-7f65-4757-8d88-658f954293ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10ea18bf-7f65-4757-8d88-658f954293ac
Content-Type: application/json

--- request body ---
{"handle":"qa-c40395869c0b","displayName":"QA c40395869c0b","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-10ea18bf-7f65-4757-8d88-658f954293ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 8
Location: /v1/accounts/qa-c40395869c0b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9d00c3fc-77e9-45dd-8051-29700f81e828","handle":"qa-c40395869c0b","displayName":"QA c40395869c0b","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.478015190Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bca960b0-2f42-4a2e-b9a9-58889d329b31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bca960b0-2f42-4a2e-b9a9-58889d329b31
Content-Type: application/json

--- request body ---
{"handle":"qa-56fd41d082de","displayName":"QA 56fd41d082de","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-bca960b0-2f42-4a2e-b9a9-58889d329b31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 8
Location: /v1/accounts/qa-56fd41d082de
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eee04059-432e-4346-b57f-3287c8987eb4","handle":"qa-56fd41d082de","displayName":"QA 56fd41d082de","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.517443477Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-96b0df6a-8457-48c0-b41d-866e21537fbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96b0df6a-8457-48c0-b41d-866e21537fbe
Content-Type: application/json

--- request body ---
{"handle":"qa-c40395869c0b","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-96b0df6a-8457-48c0-b41d-866e21537fbe
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9d00c3fc-77e9-45dd-8051-29700f81e828"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7baac14d-7ead-429f-bf87-1d7980928f3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7baac14d-7ead-429f-bf87-1d7980928f3e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-56fd41d082de","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7baac14d-7ead-429f-bf87-1d7980928f3e
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
Location: /v1/conversations/cnv_ea78db22-f3c2-43a4-8a58-23717eef30cc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ea78db22-f3c2-43a4-8a58-23717eef30cc","subject":"Error contract","status":"open","region":"eu","participants":["qa-c40395869c0b","qa-56fd41d082de"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:03.567420343Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_ea78db22-f3c2-43a4-8a58-23717eef30cc/messages
correlation: qa-c99dd133-44e6-404b-8196-d7584a1bc95c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c99dd133-44e6-404b-8196-d7584a1bc95c
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 24 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c99dd133-44e6-404b-8196-d7584a1bc95c
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_ea78db22-f3c2-43a4-8a58-23717eef30cc/messages","correlationId":"qa-c99dd133-44e6-404b-8196-d7584a1bc95c","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-86c682c3-8b46-48fd-9e4d-8607689dc1de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86c682c3-8b46-48fd-9e4d-8607689dc1de
Content-Type: application/json

--- request body ---
{"handle":"qa-56fd41d082de","password":"****"}

--- response: 200 in 32 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-86c682c3-8b46-48fd-9e4d-8607689dc1de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eee04059-432e-4346-b57f-3287c8987eb4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5f2f1eb5-db78-4e2d-b07c-7287ac9716fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f2f1eb5-db78-4e2d-b07c-7287ac9716fb
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5f2f1eb5-db78-4e2d-b07c-7287ac9716fb
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
correlation: qa-5734c0c8-da27-435e-bbe7-ea42da8eed47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5734c0c8-da27-435e-bbe7-ea42da8eed47
Content-Type: application/json

--- request body ---
{"handle":"qa-56fd41d082de","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5734c0c8-da27-435e-bbe7-ea42da8eed47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5734c0c8-da27-435e-bbe7-ea42da8eed47"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c520a7e6-d9c7-4d39-b44f-70b88f1f7c51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c520a7e6-d9c7-4d39-b44f-70b88f1f7c51
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c520a7e6-d9c7-4d39-b44f-70b88f1f7c51
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
correlation: qa-bd52bfe2-87a5-4a72-b217-c9df2499c5e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd52bfe2-87a5-4a72-b217-c9df2499c5e3
Content-Type: application/json

--- request body ---
{"handle":"qa-c40395869c0b","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bd52bfe2-87a5-4a72-b217-c9df2499c5e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bd52bfe2-87a5-4a72-b217-c9df2499c5e3"}
```
