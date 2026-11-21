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
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-9adaf592-8284-405e-8a6b-572a67c4adca` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-f5aa34a4-ac47-4347-b184-d3dba8b1ed92` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-cd549d18-3557-4b87-b05c-f43851beea7d` |
| 4 | `POST /v1/conversations` | 201 | 58 | `qa-02926ae7-eaf8-4987-9fbf-38682a58afd4` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 18 | `qa-48c68105-311b-45b5-9b93-281b039a4d90` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-6ac8b965-4db7-46ff-a9e8-a45cbc0e4070` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-8a947191-78c6-4d6a-886c-26a9f158d814` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-58957e2f-2751-49c3-bdee-2d6b796c749f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-be423aec-12d8-4a98-b88d-2646168320f5` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-0e54bbc7-1ee5-4db5-b14c-1da7e2e63d0a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9adaf592-8284-405e-8a6b-572a67c4adca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9adaf592-8284-405e-8a6b-572a67c4adca
Content-Type: application/json

--- request body ---
{"handle":"qa-349ce71c77c0","displayName":"QA 349ce71c77c0","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-9adaf592-8284-405e-8a6b-572a67c4adca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 7
Location: /v1/accounts/qa-349ce71c77c0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_34cb2201-0910-474d-8935-7058f48dc545","handle":"qa-349ce71c77c0","displayName":"QA 349ce71c77c0","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.100754648Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f5aa34a4-ac47-4347-b184-d3dba8b1ed92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5aa34a4-ac47-4347-b184-d3dba8b1ed92
Content-Type: application/json

--- request body ---
{"handle":"qa-d227818ae945","displayName":"QA d227818ae945","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5aa34a4-ac47-4347-b184-d3dba8b1ed92
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 7
Location: /v1/accounts/qa-d227818ae945
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0943de2d-12e2-4bb2-b5ff-0b86894f87bb","handle":"qa-d227818ae945","displayName":"QA d227818ae945","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.130543787Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cd549d18-3557-4b87-b05c-f43851beea7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd549d18-3557-4b87-b05c-f43851beea7d
Content-Type: application/json

--- request body ---
{"handle":"qa-349ce71c77c0","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd549d18-3557-4b87-b05c-f43851beea7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_34cb2201-0910-474d-8935-7058f48dc545"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-02926ae7-eaf8-4987-9fbf-38682a58afd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02926ae7-eaf8-4987-9fbf-38682a58afd4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d227818ae945","subject":"Error contract","message":"Hi"}

--- response: 201 in 58 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-02926ae7-eaf8-4987-9fbf-38682a58afd4
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
Location: /v1/conversations/cnv_f22bbe2f-a17a-4a19-a4ec-79392880f48e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f22bbe2f-a17a-4a19-a4ec-79392880f48e","subject":"Error contract","status":"open","region":"eu","participants":["qa-349ce71c77c0","qa-d227818ae945"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:54.249692112Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_f22bbe2f-a17a-4a19-a4ec-79392880f48e/messages
correlation: qa-48c68105-311b-45b5-9b93-281b039a4d90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48c68105-311b-45b5-9b93-281b039a4d90
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48c68105-311b-45b5-9b93-281b039a4d90
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_f22bbe2f-a17a-4a19-a4ec-79392880f48e/messages","correlationId":"qa-48c68105-311b-45b5-9b93-281b039a4d90","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6ac8b965-4db7-46ff-a9e8-a45cbc0e4070

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ac8b965-4db7-46ff-a9e8-a45cbc0e4070
Content-Type: application/json

--- request body ---
{"handle":"qa-d227818ae945","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ac8b965-4db7-46ff-a9e8-a45cbc0e4070
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0943de2d-12e2-4bb2-b5ff-0b86894f87bb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8a947191-78c6-4d6a-886c-26a9f158d814

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a947191-78c6-4d6a-886c-26a9f158d814
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8a947191-78c6-4d6a-886c-26a9f158d814
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
correlation: qa-58957e2f-2751-49c3-bdee-2d6b796c749f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58957e2f-2751-49c3-bdee-2d6b796c749f
Content-Type: application/json

--- request body ---
{"handle":"qa-d227818ae945","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58957e2f-2751-49c3-bdee-2d6b796c749f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-58957e2f-2751-49c3-bdee-2d6b796c749f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-be423aec-12d8-4a98-b88d-2646168320f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be423aec-12d8-4a98-b88d-2646168320f5
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-be423aec-12d8-4a98-b88d-2646168320f5
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
correlation: qa-0e54bbc7-1ee5-4db5-b14c-1da7e2e63d0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e54bbc7-1ee5-4db5-b14c-1da7e2e63d0a
Content-Type: application/json

--- request body ---
{"handle":"qa-349ce71c77c0","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e54bbc7-1ee5-4db5-b14c-1da7e2e63d0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0e54bbc7-1ee5-4db5-b14c-1da7e2e63d0a"}
```
