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
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-cd2b6faf-ec4f-44c4-a46f-a18e4b96d7d2` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-eae592ca-dfd9-4425-9541-2f1c66d5a2b9` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-0b5f93ed-84af-4b95-8472-aa448ee074ac` |
| 4 | `POST /v1/conversations` | 201 | 32 | `qa-91cf5a03-ebca-40e6-b2fb-2497bece2391` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 10 | `qa-f4ec3230-c8c5-4478-9a70-18b7b00118d3` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-854a9788-2a38-4443-8763-d29b186c6a1e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-6c0b7281-677a-4e0a-99b9-464e0458500f` |
| 8 | `POST /v1/auth/token` | 401 | 4 | `qa-512dace5-c717-4602-af0e-80d82bf29d1c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-8edca8aa-e58a-42f9-9143-9e9850c894e9` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-56aa1213-cba1-4f67-8f1a-61ed1f0ec1b0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cd2b6faf-ec4f-44c4-a46f-a18e4b96d7d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd2b6faf-ec4f-44c4-a46f-a18e4b96d7d2
Content-Type: application/json

--- request body ---
{"handle":"qa-537fe433b8a4","displayName":"QA 537fe433b8a4","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd2b6faf-ec4f-44c4-a46f-a18e4b96d7d2
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
Location: /v1/accounts/qa-537fe433b8a4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_69d74a87-cb8b-4313-9c80-6cc526941e9e","handle":"qa-537fe433b8a4","displayName":"QA 537fe433b8a4","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.774540636Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-eae592ca-dfd9-4425-9541-2f1c66d5a2b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eae592ca-dfd9-4425-9541-2f1c66d5a2b9
Content-Type: application/json

--- request body ---
{"handle":"qa-8f8a983fb663","displayName":"QA 8f8a983fb663","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-eae592ca-dfd9-4425-9541-2f1c66d5a2b9
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
Location: /v1/accounts/qa-8f8a983fb663
X-Served-Region: eu
Content-Length: 181

{"id":"acc_064c80b9-57be-41a5-92f1-60880519da4c","handle":"qa-8f8a983fb663","displayName":"QA 8f8a983fb663","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.795933979Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0b5f93ed-84af-4b95-8472-aa448ee074ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b5f93ed-84af-4b95-8472-aa448ee074ac
Content-Type: application/json

--- request body ---
{"handle":"qa-537fe433b8a4","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b5f93ed-84af-4b95-8472-aa448ee074ac
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_69d74a87-cb8b-4313-9c80-6cc526941e9e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-91cf5a03-ebca-40e6-b2fb-2497bece2391

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91cf5a03-ebca-40e6-b2fb-2497bece2391
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8f8a983fb663","subject":"Error contract","message":"Hi"}

--- response: 201 in 32 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-91cf5a03-ebca-40e6-b2fb-2497bece2391
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
Location: /v1/conversations/cnv_8bdbadca-08b3-4388-8303-b34dd7957a2e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8bdbadca-08b3-4388-8303-b34dd7957a2e","subject":"Error contract","status":"open","region":"eu","participants":["qa-537fe433b8a4","qa-8f8a983fb663"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.880860355Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_8bdbadca-08b3-4388-8303-b34dd7957a2e/messages
correlation: qa-f4ec3230-c8c5-4478-9a70-18b7b00118d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4ec3230-c8c5-4478-9a70-18b7b00118d3
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4ec3230-c8c5-4478-9a70-18b7b00118d3
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_8bdbadca-08b3-4388-8303-b34dd7957a2e/messages","correlationId":"qa-f4ec3230-c8c5-4478-9a70-18b7b00118d3","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-854a9788-2a38-4443-8763-d29b186c6a1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-854a9788-2a38-4443-8763-d29b186c6a1e
Content-Type: application/json

--- request body ---
{"handle":"qa-8f8a983fb663","password":"****"}

--- response: 200 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-854a9788-2a38-4443-8763-d29b186c6a1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_064c80b9-57be-41a5-92f1-60880519da4c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6c0b7281-677a-4e0a-99b9-464e0458500f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c0b7281-677a-4e0a-99b9-464e0458500f
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6c0b7281-677a-4e0a-99b9-464e0458500f
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
correlation: qa-512dace5-c717-4602-af0e-80d82bf29d1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-512dace5-c717-4602-af0e-80d82bf29d1c
Content-Type: application/json

--- request body ---
{"handle":"qa-8f8a983fb663","password":"****"}

--- response: 401 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-512dace5-c717-4602-af0e-80d82bf29d1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-512dace5-c717-4602-af0e-80d82bf29d1c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8edca8aa-e58a-42f9-9143-9e9850c894e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8edca8aa-e58a-42f9-9143-9e9850c894e9
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8edca8aa-e58a-42f9-9143-9e9850c894e9
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
correlation: qa-56aa1213-cba1-4f67-8f1a-61ed1f0ec1b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56aa1213-cba1-4f67-8f1a-61ed1f0ec1b0
Content-Type: application/json

--- request body ---
{"handle":"qa-537fe433b8a4","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-56aa1213-cba1-4f67-8f1a-61ed1f0ec1b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-56aa1213-cba1-4f67-8f1a-61ed1f0ec1b0"}
```
