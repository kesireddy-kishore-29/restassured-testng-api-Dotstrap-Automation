# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-6cc7c678-bbe3-40d5-acad-eee17cde57a8` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-e7a1e8f8-630b-46c2-8eaa-d65478cf848d` |
| 3 | `POST /v1/auth/token` | 200 | 82 | `qa-096134fc-76a5-4ba5-bae6-55c2fdecfe37` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-1dcfec2c-de30-427e-bd04-3971def68800` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 5 | `qa-bdd752d2-2f4f-4255-bf46-b6b785b4678e` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-151a427a-a757-47f5-a1d4-c386579301e0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-f45de62f-f654-4bdc-96f4-e88c0df6f65a` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-a2e0c509-6e19-4ff2-b17f-3f8ec5412201` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-6848f19d-8406-4f7b-959f-031e7724d51a` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-d1cc4e3d-e89f-4643-b6e6-701e6dae0a91` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6cc7c678-bbe3-40d5-acad-eee17cde57a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cc7c678-bbe3-40d5-acad-eee17cde57a8
Content-Type: application/json

--- request body ---
{"handle":"qa-bfe240554869","displayName":"QA bfe240554869","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6cc7c678-bbe3-40d5-acad-eee17cde57a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 8
Location: /v1/accounts/qa-bfe240554869
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c2133449-d619-40d8-9d98-52dfd69da880","handle":"qa-bfe240554869","displayName":"QA bfe240554869","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.353275752Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e7a1e8f8-630b-46c2-8eaa-d65478cf848d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7a1e8f8-630b-46c2-8eaa-d65478cf848d
Content-Type: application/json

--- request body ---
{"handle":"qa-5dc404b64d88","displayName":"QA 5dc404b64d88","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7a1e8f8-630b-46c2-8eaa-d65478cf848d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 8
Location: /v1/accounts/qa-5dc404b64d88
X-Served-Region: eu
Content-Length: 181

{"id":"acc_844708fc-6831-4285-8739-89300d73f988","handle":"qa-5dc404b64d88","displayName":"QA 5dc404b64d88","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.378944321Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-096134fc-76a5-4ba5-bae6-55c2fdecfe37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-096134fc-76a5-4ba5-bae6-55c2fdecfe37
Content-Type: application/json

--- request body ---
{"handle":"qa-bfe240554869","password":"****"}

--- response: 200 in 82 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-096134fc-76a5-4ba5-bae6-55c2fdecfe37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c2133449-d619-40d8-9d98-52dfd69da880"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1dcfec2c-de30-427e-bd04-3971def68800

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dcfec2c-de30-427e-bd04-3971def68800
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5dc404b64d88","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1dcfec2c-de30-427e-bd04-3971def68800
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
Location: /v1/conversations/cnv_c166250a-ef24-43bd-a590-5e4b9e72d814
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c166250a-ef24-43bd-a590-5e4b9e72d814","subject":"Error contract","status":"open","region":"eu","participants":["qa-bfe240554869","qa-5dc404b64d88"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:03.476031159Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_c166250a-ef24-43bd-a590-5e4b9e72d814/messages
correlation: qa-bdd752d2-2f4f-4255-bf46-b6b785b4678e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdd752d2-2f4f-4255-bf46-b6b785b4678e
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bdd752d2-2f4f-4255-bf46-b6b785b4678e
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_c166250a-ef24-43bd-a590-5e4b9e72d814/messages","correlationId":"qa-bdd752d2-2f4f-4255-bf46-b6b785b4678e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-151a427a-a757-47f5-a1d4-c386579301e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-151a427a-a757-47f5-a1d4-c386579301e0
Content-Type: application/json

--- request body ---
{"handle":"qa-5dc404b64d88","password":"****"}

--- response: 200 in 38 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-151a427a-a757-47f5-a1d4-c386579301e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_844708fc-6831-4285-8739-89300d73f988"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f45de62f-f654-4bdc-96f4-e88c0df6f65a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f45de62f-f654-4bdc-96f4-e88c0df6f65a
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f45de62f-f654-4bdc-96f4-e88c0df6f65a
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
correlation: qa-a2e0c509-6e19-4ff2-b17f-3f8ec5412201

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2e0c509-6e19-4ff2-b17f-3f8ec5412201
Content-Type: application/json

--- request body ---
{"handle":"qa-5dc404b64d88","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a2e0c509-6e19-4ff2-b17f-3f8ec5412201
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a2e0c509-6e19-4ff2-b17f-3f8ec5412201"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6848f19d-8406-4f7b-959f-031e7724d51a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6848f19d-8406-4f7b-959f-031e7724d51a
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6848f19d-8406-4f7b-959f-031e7724d51a
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
correlation: qa-d1cc4e3d-e89f-4643-b6e6-701e6dae0a91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1cc4e3d-e89f-4643-b6e6-701e6dae0a91
Content-Type: application/json

--- request body ---
{"handle":"qa-bfe240554869","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d1cc4e3d-e89f-4643-b6e6-701e6dae0a91
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d1cc4e3d-e89f-4643-b6e6-701e6dae0a91"}
```
