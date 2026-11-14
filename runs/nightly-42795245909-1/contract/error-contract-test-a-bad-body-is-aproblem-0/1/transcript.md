# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-8bace866-9864-4406-9f85-6e8ce5a1a927` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-d49d042d-5a82-42c1-949d-ce400b691eaf` |
| 3 | `POST /v1/auth/token` | 200 | 7 | `qa-ee118788-c668-478b-95cd-017b49ea4157` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-b70b95cc-c104-46da-bde6-64538608d995` |
| 5 | `POST /v1/auth/token` | 400 | 12 | `qa-884bf6d8-23ef-4b55-bb27-642c232be76b` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-7260726d-be97-42a4-80b6-f62ce3484b04` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-7d465e59-463a-4e88-8cf4-5d0c792b5b2b` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-9c44d1af-4c2f-4af2-8134-a1ad398452e6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 44 | `qa-fd471626-3cec-4b75-bb9c-48f47f6d9cba` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-b6312b80-6a3e-49ba-a690-6be862a5c70a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8bace866-9864-4406-9f85-6e8ce5a1a927

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bace866-9864-4406-9f85-6e8ce5a1a927
Content-Type: application/json

--- request body ---
{"handle":"qa-a9aa710c0f3e","displayName":"QA a9aa710c0f3e","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bace866-9864-4406-9f85-6e8ce5a1a927
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Location: /v1/accounts/qa-a9aa710c0f3e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_db67b5d2-1c15-4f40-855f-76fa0de54722","handle":"qa-a9aa710c0f3e","displayName":"QA a9aa710c0f3e","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.093463181Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d49d042d-5a82-42c1-949d-ce400b691eaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d49d042d-5a82-42c1-949d-ce400b691eaf
Content-Type: application/json

--- request body ---
{"handle":"qa-2ddf74038348","displayName":"QA 2ddf74038348","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-d49d042d-5a82-42c1-949d-ce400b691eaf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-2ddf74038348
X-Served-Region: eu
Content-Length: 181

{"id":"acc_05c3b729-970a-4026-89e8-6ea2aacee4ce","handle":"qa-2ddf74038348","displayName":"QA 2ddf74038348","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.148939512Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ee118788-c668-478b-95cd-017b49ea4157

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee118788-c668-478b-95cd-017b49ea4157
Content-Type: application/json

--- request body ---
{"handle":"qa-a9aa710c0f3e","password":"****"}

--- response: 200 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee118788-c668-478b-95cd-017b49ea4157
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_db67b5d2-1c15-4f40-855f-76fa0de54722"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b70b95cc-c104-46da-bde6-64538608d995

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b70b95cc-c104-46da-bde6-64538608d995
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2ddf74038348","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b70b95cc-c104-46da-bde6-64538608d995
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
Location: /v1/conversations/cnv_020ffc06-461d-42da-a2f1-7b7df553cf82
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_020ffc06-461d-42da-a2f1-7b7df553cf82","subject":"Error contract","status":"open","region":"eu","participants":["qa-a9aa710c0f3e","qa-2ddf74038348"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:35.186979301Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-884bf6d8-23ef-4b55-bb27-642c232be76b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-884bf6d8-23ef-4b55-bb27-642c232be76b
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-884bf6d8-23ef-4b55-bb27-642c232be76b
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
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-884bf6d8-23ef-4b55-bb27-642c232be76b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7260726d-be97-42a4-80b6-f62ce3484b04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7260726d-be97-42a4-80b6-f62ce3484b04
Content-Type: application/json

--- request body ---
{"handle":"qa-2ddf74038348","password":"****"}

--- response: 200 in 30 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-7260726d-be97-42a4-80b6-f62ce3484b04
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_05c3b729-970a-4026-89e8-6ea2aacee4ce"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7d465e59-463a-4e88-8cf4-5d0c792b5b2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d465e59-463a-4e88-8cf4-5d0c792b5b2b
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7d465e59-463a-4e88-8cf4-5d0c792b5b2b
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
correlation: qa-9c44d1af-4c2f-4af2-8134-a1ad398452e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c44d1af-4c2f-4af2-8134-a1ad398452e6
Content-Type: application/json

--- request body ---
{"handle":"qa-2ddf74038348","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c44d1af-4c2f-4af2-8134-a1ad398452e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9c44d1af-4c2f-4af2-8134-a1ad398452e6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd471626-3cec-4b75-bb9c-48f47f6d9cba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd471626-3cec-4b75-bb9c-48f47f6d9cba
Content-Type: application/json

--- response: 204 in 44 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fd471626-3cec-4b75-bb9c-48f47f6d9cba
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
correlation: qa-b6312b80-6a3e-49ba-a690-6be862a5c70a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6312b80-6a3e-49ba-a690-6be862a5c70a
Content-Type: application/json

--- request body ---
{"handle":"qa-a9aa710c0f3e","password":"****"}

--- response: 401 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b6312b80-6a3e-49ba-a690-6be862a5c70a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b6312b80-6a3e-49ba-a690-6be862a5c70a"}
```
