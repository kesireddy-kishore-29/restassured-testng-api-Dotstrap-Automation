# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 60 | `qa-ee3883b2-76d2-4246-8dd6-c34ca0c8a069` |
| 2 | `POST /v1/accounts` | 201 | 54 | `qa-eade5a6f-45b6-4670-83da-b63af219fd1f` |
| 3 | `POST /v1/accounts` | 201 | 29 | `qa-4643ed0d-092d-4109-8fc5-d0ecca54da12` |
| 4 | `POST /v1/auth/token` | 200 | 28 | `qa-fe20768e-fdd5-4685-84b9-b025ae59ec1f` |
| 5 | `POST /v1/conversations` | 201 | 16 | `qa-2af8ed9b-8582-4315-aa03-2aa5d1675f97` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-4b441019-bf3b-426d-a641-9963bf6ee9b1` |
| 7 | `GET /v1/conversations/{id}` | 403 | 22 | `qa-13409c8d-ac25-411f-b178-b2d53e4fc201` |
| 8 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-7f1eb8c7-9af6-454c-a213-dbfdead170e1` |
| 9 | `POST /v1/auth/token` | 401 | 40 | `qa-a9953db1-2e7c-493e-beae-c609b3351c49` |
| 10 | `POST /v1/auth/token` | 200 | 45 | `qa-8b08f6b4-f6f4-49de-8963-e8a41ad31498` |
| 11 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-f12eb307-c294-4776-82f6-74ef5f338215` |
| 12 | `POST /v1/auth/token` | 401 | 15 | `qa-aa382a0a-8a5b-4851-994c-cb2fd0ac1d77` |
| 13 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-cf9ddb84-e6b8-441c-a774-5b7a915a54e4` |
| 14 | `POST /v1/auth/token` | 401 | 11 | `qa-bd0d08c4-9ea9-4831-9466-ac34939d77f1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ee3883b2-76d2-4246-8dd6-c34ca0c8a069

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee3883b2-76d2-4246-8dd6-c34ca0c8a069
Content-Type: application/json

--- request body ---
{"handle":"qa-b2561c6755f4","displayName":"QA b2561c6755f4","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee3883b2-76d2-4246-8dd6-c34ca0c8a069
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
Location: /v1/accounts/qa-b2561c6755f4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b73c45f-2fda-44e4-aa43-de48d61daa80","handle":"qa-b2561c6755f4","displayName":"QA b2561c6755f4","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.037227747Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-eade5a6f-45b6-4670-83da-b63af219fd1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eade5a6f-45b6-4670-83da-b63af219fd1f
Content-Type: application/json

--- request body ---
{"handle":"qa-83b608b5ef06","displayName":"QA 83b608b5ef06","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-eade5a6f-45b6-4670-83da-b63af219fd1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 9
Location: /v1/accounts/qa-83b608b5ef06
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d2fab9a3-3829-418e-a03d-e227ebee1501","handle":"qa-83b608b5ef06","displayName":"QA 83b608b5ef06","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.123686595Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-4643ed0d-092d-4109-8fc5-d0ecca54da12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4643ed0d-092d-4109-8fc5-d0ecca54da12
Content-Type: application/json

--- request body ---
{"handle":"qa-def364307d66","displayName":"QA def364307d66","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4643ed0d-092d-4109-8fc5-d0ecca54da12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Location: /v1/accounts/qa-def364307d66
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7ed0b4f1-93e0-4d8f-81f5-adaba3e10234","handle":"qa-def364307d66","displayName":"QA def364307d66","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.198124531Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-fe20768e-fdd5-4685-84b9-b025ae59ec1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe20768e-fdd5-4685-84b9-b025ae59ec1f
Content-Type: application/json

--- request body ---
{"handle":"qa-b2561c6755f4","password":"****"}

--- response: 200 in 28 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe20768e-fdd5-4685-84b9-b025ae59ec1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b73c45f-2fda-44e4-aa43-de48d61daa80"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-2af8ed9b-8582-4315-aa03-2aa5d1675f97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2af8ed9b-8582-4315-aa03-2aa5d1675f97
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-83b608b5ef06","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-2af8ed9b-8582-4315-aa03-2aa5d1675f97
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
Location: /v1/conversations/cnv_a5835f0b-a3e2-4ce7-bee1-0d592b24bc09
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a5835f0b-a3e2-4ce7-bee1-0d592b24bc09","subject":"Error contract","status":"open","region":"eu","participants":["qa-b2561c6755f4","qa-83b608b5ef06"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:57.312974676Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4b441019-bf3b-426d-a641-9963bf6ee9b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b441019-bf3b-426d-a641-9963bf6ee9b1
Content-Type: application/json

--- request body ---
{"handle":"qa-def364307d66","password":"****"}

--- response: 200 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b441019-bf3b-426d-a641-9963bf6ee9b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7ed0b4f1-93e0-4d8f-81f5-adaba3e10234"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_a5835f0b-a3e2-4ce7-bee1-0d592b24bc09
correlation: qa-13409c8d-ac25-411f-b178-b2d53e4fc201

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13409c8d-ac25-411f-b178-b2d53e4fc201
Content-Type: application/json

--- response: 403 in 22 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-13409c8d-ac25-411f-b178-b2d53e4fc201
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_a5835f0b-a3e2-4ce7-bee1-0d592b24bc09","correlationId":"qa-13409c8d-ac25-411f-b178-b2d53e4fc201"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7f1eb8c7-9af6-454c-a213-dbfdead170e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f1eb8c7-9af6-454c-a213-dbfdead170e1
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7f1eb8c7-9af6-454c-a213-dbfdead170e1
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-a9953db1-2e7c-493e-beae-c609b3351c49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9953db1-2e7c-493e-beae-c609b3351c49
Content-Type: application/json

--- request body ---
{"handle":"qa-def364307d66","password":"****"}

--- response: 401 in 40 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9953db1-2e7c-493e-beae-c609b3351c49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a9953db1-2e7c-493e-beae-c609b3351c49"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8b08f6b4-f6f4-49de-8963-e8a41ad31498

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b08f6b4-f6f4-49de-8963-e8a41ad31498
Content-Type: application/json

--- request body ---
{"handle":"qa-83b608b5ef06","password":"****"}

--- response: 200 in 45 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b08f6b4-f6f4-49de-8963-e8a41ad31498
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d2fab9a3-3829-418e-a03d-e227ebee1501"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f12eb307-c294-4776-82f6-74ef5f338215

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f12eb307-c294-4776-82f6-74ef5f338215
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f12eb307-c294-4776-82f6-74ef5f338215
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-aa382a0a-8a5b-4851-994c-cb2fd0ac1d77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa382a0a-8a5b-4851-994c-cb2fd0ac1d77
Content-Type: application/json

--- request body ---
{"handle":"qa-83b608b5ef06","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa382a0a-8a5b-4851-994c-cb2fd0ac1d77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aa382a0a-8a5b-4851-994c-cb2fd0ac1d77"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cf9ddb84-e6b8-441c-a774-5b7a915a54e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf9ddb84-e6b8-441c-a774-5b7a915a54e4
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cf9ddb84-e6b8-441c-a774-5b7a915a54e4
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-bd0d08c4-9ea9-4831-9466-ac34939d77f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd0d08c4-9ea9-4831-9466-ac34939d77f1
Content-Type: application/json

--- request body ---
{"handle":"qa-b2561c6755f4","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bd0d08c4-9ea9-4831-9466-ac34939d77f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bd0d08c4-9ea9-4831-9466-ac34939d77f1"}
```
