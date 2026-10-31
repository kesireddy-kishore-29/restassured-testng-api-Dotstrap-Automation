# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-238a8450-38c2-411c-b07a-7084f73c8c87` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-3d4f61ca-701b-4443-a6f4-82088e38ebc7` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-e2a89366-cd7b-43b2-91eb-ba9701188019` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-1be91f65-01a9-49ee-b6e8-ec49215a2c61` |
| 5 | `POST /v1/conversations` | 422 | 22 | `qa-0226761d-abb2-4db5-935b-12dd03776750` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-e70cac59-2cad-4374-9ea7-3b2d21853b60` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-000741b7-b64d-4c9e-8789-77dcf0808544` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-29af7456-e1f4-4fa3-80a1-79db77b362e7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-851e3d6b-5da2-4561-a5e5-e7b9147dfad9` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-9df050da-8cca-4c9b-ae29-1934778f9755` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-238a8450-38c2-411c-b07a-7084f73c8c87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-238a8450-38c2-411c-b07a-7084f73c8c87
Content-Type: application/json

--- request body ---
{"handle":"qa-e050481640fc","displayName":"QA e050481640fc","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-238a8450-38c2-411c-b07a-7084f73c8c87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 8
Location: /v1/accounts/qa-e050481640fc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_027c45df-fd13-4569-aa56-c9510c50fecf","handle":"qa-e050481640fc","displayName":"QA e050481640fc","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.177511366Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3d4f61ca-701b-4443-a6f4-82088e38ebc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d4f61ca-701b-4443-a6f4-82088e38ebc7
Content-Type: application/json

--- request body ---
{"handle":"qa-d067f2fe86ee","displayName":"QA d067f2fe86ee","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d4f61ca-701b-4443-a6f4-82088e38ebc7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 8
Location: /v1/accounts/qa-d067f2fe86ee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_28eaa08d-91b6-4fdd-80bf-88eb5c254834","handle":"qa-d067f2fe86ee","displayName":"QA d067f2fe86ee","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.209059786Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e2a89366-cd7b-43b2-91eb-ba9701188019

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2a89366-cd7b-43b2-91eb-ba9701188019
Content-Type: application/json

--- request body ---
{"handle":"qa-e050481640fc","password":"****"}

--- response: 200 in 31 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2a89366-cd7b-43b2-91eb-ba9701188019
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_027c45df-fd13-4569-aa56-c9510c50fecf"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1be91f65-01a9-49ee-b6e8-ec49215a2c61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1be91f65-01a9-49ee-b6e8-ec49215a2c61
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d067f2fe86ee","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-1be91f65-01a9-49ee-b6e8-ec49215a2c61
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
Location: /v1/conversations/cnv_7b675bf6-7848-45a7-bf0b-aebc457632d9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7b675bf6-7848-45a7-bf0b-aebc457632d9","subject":"Error contract","status":"open","region":"eu","participants":["qa-e050481640fc","qa-d067f2fe86ee"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.275170501Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-0226761d-abb2-4db5-935b-12dd03776750

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0226761d-abb2-4db5-935b-12dd03776750
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d067f2fe86ee","subject":" ","message":"Hi"}

--- response: 422 in 22 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0226761d-abb2-4db5-935b-12dd03776750
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-0226761d-abb2-4db5-935b-12dd03776750","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e70cac59-2cad-4374-9ea7-3b2d21853b60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e70cac59-2cad-4374-9ea7-3b2d21853b60
Content-Type: application/json

--- request body ---
{"handle":"qa-d067f2fe86ee","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-e70cac59-2cad-4374-9ea7-3b2d21853b60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_28eaa08d-91b6-4fdd-80bf-88eb5c254834"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-000741b7-b64d-4c9e-8789-77dcf0808544

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-000741b7-b64d-4c9e-8789-77dcf0808544
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-000741b7-b64d-4c9e-8789-77dcf0808544
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
correlation: qa-29af7456-e1f4-4fa3-80a1-79db77b362e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29af7456-e1f4-4fa3-80a1-79db77b362e7
Content-Type: application/json

--- request body ---
{"handle":"qa-d067f2fe86ee","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29af7456-e1f4-4fa3-80a1-79db77b362e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-29af7456-e1f4-4fa3-80a1-79db77b362e7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-851e3d6b-5da2-4561-a5e5-e7b9147dfad9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-851e3d6b-5da2-4561-a5e5-e7b9147dfad9
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-851e3d6b-5da2-4561-a5e5-e7b9147dfad9
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
correlation: qa-9df050da-8cca-4c9b-ae29-1934778f9755

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9df050da-8cca-4c9b-ae29-1934778f9755
Content-Type: application/json

--- request body ---
{"handle":"qa-e050481640fc","password":"****"}

--- response: 401 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9df050da-8cca-4c9b-ae29-1934778f9755
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9df050da-8cca-4c9b-ae29-1934778f9755"}
```
