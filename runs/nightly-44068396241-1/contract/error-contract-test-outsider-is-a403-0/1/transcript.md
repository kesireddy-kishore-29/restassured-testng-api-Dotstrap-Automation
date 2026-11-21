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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-ee1eb2ef-936a-44b6-aab1-48e1e6a0e922` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-b657ef7f-8ebb-4754-9286-b8ebef9d3c7d` |
| 3 | `POST /v1/accounts` | 201 | 16 | `qa-c44d1666-b363-40a2-a1b3-542eb369adc4` |
| 4 | `POST /v1/auth/token` | 200 | 17 | `qa-e02cf68e-bc36-48ee-b0ae-8d15f8e85e11` |
| 5 | `POST /v1/conversations` | 201 | 4 | `qa-4ce2b40e-0d88-4b52-b57b-e53c4bb4e2a4` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-927eddd8-fd9a-410a-89f8-acc4c56010d2` |
| 7 | `GET /v1/conversations/{id}` | 403 | 11 | `qa-a1ba7f7b-2dd6-47c7-97af-aa8c8092c18c` |
| 8 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-2f2a6aa2-5f9c-4e6b-b02c-df3cfea72eb5` |
| 9 | `POST /v1/auth/token` | 401 | 24 | `qa-3f8de129-a5b2-4fb7-bce0-4d366c9c8e22` |
| 10 | `POST /v1/auth/token` | 200 | 53 | `qa-59d90c79-bbf0-42b1-948a-374e75f17736` |
| 11 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-81fec487-1fe1-4fe8-908c-7263b5f7114c` |
| 12 | `POST /v1/auth/token` | 401 | 24 | `qa-aa8a3425-0ea5-4448-a792-9a8e13b9a4b7` |
| 13 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-7a3a7f96-3f46-4e20-86e3-4de22460d03e` |
| 14 | `POST /v1/auth/token` | 401 | 17 | `qa-c2188358-a17e-45bf-b64c-6487b37e29f1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ee1eb2ef-936a-44b6-aab1-48e1e6a0e922

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee1eb2ef-936a-44b6-aab1-48e1e6a0e922
Content-Type: application/json

--- request body ---
{"handle":"qa-369e0f056bf8","displayName":"QA 369e0f056bf8","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee1eb2ef-936a-44b6-aab1-48e1e6a0e922
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 10
Location: /v1/accounts/qa-369e0f056bf8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8fc9e2c0-1224-482f-a347-47c18ab0dc2e","handle":"qa-369e0f056bf8","displayName":"QA 369e0f056bf8","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.692994572Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b657ef7f-8ebb-4754-9286-b8ebef9d3c7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b657ef7f-8ebb-4754-9286-b8ebef9d3c7d
Content-Type: application/json

--- request body ---
{"handle":"qa-0e0b1e49daac","displayName":"QA 0e0b1e49daac","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-b657ef7f-8ebb-4754-9286-b8ebef9d3c7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 10
Location: /v1/accounts/qa-0e0b1e49daac
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6958de83-f50a-4847-8c7c-751521b5350d","handle":"qa-0e0b1e49daac","displayName":"QA 0e0b1e49daac","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.737705920Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-c44d1666-b363-40a2-a1b3-542eb369adc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c44d1666-b363-40a2-a1b3-542eb369adc4
Content-Type: application/json

--- request body ---
{"handle":"qa-a5cd0e332e04","displayName":"QA a5cd0e332e04","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-c44d1666-b363-40a2-a1b3-542eb369adc4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Location: /v1/accounts/qa-a5cd0e332e04
X-Served-Region: eu
Content-Length: 181

{"id":"acc_04db3e43-83ed-4787-b2d5-c34ec8166b61","handle":"qa-a5cd0e332e04","displayName":"QA a5cd0e332e04","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.776717848Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-e02cf68e-bc36-48ee-b0ae-8d15f8e85e11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e02cf68e-bc36-48ee-b0ae-8d15f8e85e11
Content-Type: application/json

--- request body ---
{"handle":"qa-369e0f056bf8","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-e02cf68e-bc36-48ee-b0ae-8d15f8e85e11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8fc9e2c0-1224-482f-a347-47c18ab0dc2e"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-4ce2b40e-0d88-4b52-b57b-e53c4bb4e2a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ce2b40e-0d88-4b52-b57b-e53c4bb4e2a4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0e0b1e49daac","subject":"Error contract","message":"Hi"}

--- response: 201 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ce2b40e-0d88-4b52-b57b-e53c4bb4e2a4
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
Location: /v1/conversations/cnv_4804e424-a097-4a9e-b908-ae527740d3e6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4804e424-a097-4a9e-b908-ae527740d3e6","subject":"Error contract","status":"open","region":"eu","participants":["qa-369e0f056bf8","qa-0e0b1e49daac"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:17.826439601Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-927eddd8-fd9a-410a-89f8-acc4c56010d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-927eddd8-fd9a-410a-89f8-acc4c56010d2
Content-Type: application/json

--- request body ---
{"handle":"qa-a5cd0e332e04","password":"****"}

--- response: 200 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-927eddd8-fd9a-410a-89f8-acc4c56010d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_04db3e43-83ed-4787-b2d5-c34ec8166b61"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_4804e424-a097-4a9e-b908-ae527740d3e6
correlation: qa-a1ba7f7b-2dd6-47c7-97af-aa8c8092c18c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1ba7f7b-2dd6-47c7-97af-aa8c8092c18c
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1ba7f7b-2dd6-47c7-97af-aa8c8092c18c
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_4804e424-a097-4a9e-b908-ae527740d3e6","correlationId":"qa-a1ba7f7b-2dd6-47c7-97af-aa8c8092c18c"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2f2a6aa2-5f9c-4e6b-b02c-df3cfea72eb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f2a6aa2-5f9c-4e6b-b02c-df3cfea72eb5
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2f2a6aa2-5f9c-4e6b-b02c-df3cfea72eb5
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
correlation: qa-3f8de129-a5b2-4fb7-bce0-4d366c9c8e22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f8de129-a5b2-4fb7-bce0-4d366c9c8e22
Content-Type: application/json

--- request body ---
{"handle":"qa-a5cd0e332e04","password":"****"}

--- response: 401 in 24 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f8de129-a5b2-4fb7-bce0-4d366c9c8e22
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3f8de129-a5b2-4fb7-bce0-4d366c9c8e22"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-59d90c79-bbf0-42b1-948a-374e75f17736

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59d90c79-bbf0-42b1-948a-374e75f17736
Content-Type: application/json

--- request body ---
{"handle":"qa-0e0b1e49daac","password":"****"}

--- response: 200 in 53 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-59d90c79-bbf0-42b1-948a-374e75f17736
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6958de83-f50a-4847-8c7c-751521b5350d"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-81fec487-1fe1-4fe8-908c-7263b5f7114c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81fec487-1fe1-4fe8-908c-7263b5f7114c
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-81fec487-1fe1-4fe8-908c-7263b5f7114c
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
correlation: qa-aa8a3425-0ea5-4448-a792-9a8e13b9a4b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa8a3425-0ea5-4448-a792-9a8e13b9a4b7
Content-Type: application/json

--- request body ---
{"handle":"qa-0e0b1e49daac","password":"****"}

--- response: 401 in 24 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa8a3425-0ea5-4448-a792-9a8e13b9a4b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aa8a3425-0ea5-4448-a792-9a8e13b9a4b7"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7a3a7f96-3f46-4e20-86e3-4de22460d03e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a3a7f96-3f46-4e20-86e3-4de22460d03e
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7a3a7f96-3f46-4e20-86e3-4de22460d03e
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
correlation: qa-c2188358-a17e-45bf-b64c-6487b37e29f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2188358-a17e-45bf-b64c-6487b37e29f1
Content-Type: application/json

--- request body ---
{"handle":"qa-369e0f056bf8","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c2188358-a17e-45bf-b64c-6487b37e29f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c2188358-a17e-45bf-b64c-6487b37e29f1"}
```
