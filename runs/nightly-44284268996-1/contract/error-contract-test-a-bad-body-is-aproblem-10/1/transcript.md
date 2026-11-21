# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[10]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-2b006582-559c-47d2-917c-4fd59e128e4c` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-ae8df59d-4283-4e36-ad14-185d522eb3a1` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-fa49c22f-67ef-4fdf-9151-b6303c32d728` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-b5ae239d-7742-4598-9e49-783792ebe1b3` |
| 5 | `POST /v1/conversations` | 415 | 26 | `qa-7e002f09-a71f-4640-8648-828392ef47b3` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-3d2bd99a-4bb9-4235-b8a8-6bc711d1fb7c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 38 | `qa-977b6e15-145c-4cdc-8995-d29989190651` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-d62a3ad6-627e-44f8-bac0-897cd038105f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-fc01482a-7309-41ab-b9ae-076891b8c22e` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-7c4f1149-3122-4a7f-a503-8d7e8aa34891` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2b006582-559c-47d2-917c-4fd59e128e4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b006582-559c-47d2-917c-4fd59e128e4c
Content-Type: application/json

--- request body ---
{"handle":"qa-1d7fef65b404","displayName":"QA 1d7fef65b404","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b006582-559c-47d2-917c-4fd59e128e4c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Location: /v1/accounts/qa-1d7fef65b404
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8a5cd093-3962-4313-a343-042177c67d4b","handle":"qa-1d7fef65b404","displayName":"QA 1d7fef65b404","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.240715719Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ae8df59d-4283-4e36-ad14-185d522eb3a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae8df59d-4283-4e36-ad14-185d522eb3a1
Content-Type: application/json

--- request body ---
{"handle":"qa-4db6f05d9434","displayName":"QA 4db6f05d9434","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae8df59d-4283-4e36-ad14-185d522eb3a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 8
Location: /v1/accounts/qa-4db6f05d9434
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ab0d6b2a-a9ed-4a88-b74d-8e4bdfdd1b0c","handle":"qa-4db6f05d9434","displayName":"QA 4db6f05d9434","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.277197533Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fa49c22f-67ef-4fdf-9151-b6303c32d728

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa49c22f-67ef-4fdf-9151-b6303c32d728
Content-Type: application/json

--- request body ---
{"handle":"qa-1d7fef65b404","password":"****"}

--- response: 200 in 20 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa49c22f-67ef-4fdf-9151-b6303c32d728
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8a5cd093-3962-4313-a343-042177c67d4b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b5ae239d-7742-4598-9e49-783792ebe1b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5ae239d-7742-4598-9e49-783792ebe1b3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4db6f05d9434","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5ae239d-7742-4598-9e49-783792ebe1b3
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
Location: /v1/conversations/cnv_cff2e3ed-5bd1-4728-8f8d-9afbff3a607a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cff2e3ed-5bd1-4728-8f8d-9afbff3a607a","subject":"Error contract","status":"open","region":"eu","participants":["qa-1d7fef65b404","qa-4db6f05d9434"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.330328831Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-7e002f09-a71f-4640-8648-828392ef47b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e002f09-a71f-4640-8648-828392ef47b3
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e002f09-a71f-4640-8648-828392ef47b3
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-7e002f09-a71f-4640-8648-828392ef47b3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3d2bd99a-4bb9-4235-b8a8-6bc711d1fb7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d2bd99a-4bb9-4235-b8a8-6bc711d1fb7c
Content-Type: application/json

--- request body ---
{"handle":"qa-4db6f05d9434","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d2bd99a-4bb9-4235-b8a8-6bc711d1fb7c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ab0d6b2a-a9ed-4a88-b74d-8e4bdfdd1b0c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-977b6e15-145c-4cdc-8995-d29989190651

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-977b6e15-145c-4cdc-8995-d29989190651
Content-Type: application/json

--- response: 204 in 38 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-977b6e15-145c-4cdc-8995-d29989190651
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
correlation: qa-d62a3ad6-627e-44f8-bac0-897cd038105f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d62a3ad6-627e-44f8-bac0-897cd038105f
Content-Type: application/json

--- request body ---
{"handle":"qa-4db6f05d9434","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d62a3ad6-627e-44f8-bac0-897cd038105f
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d62a3ad6-627e-44f8-bac0-897cd038105f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fc01482a-7309-41ab-b9ae-076891b8c22e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc01482a-7309-41ab-b9ae-076891b8c22e
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fc01482a-7309-41ab-b9ae-076891b8c22e
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
correlation: qa-7c4f1149-3122-4a7f-a503-8d7e8aa34891

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c4f1149-3122-4a7f-a503-8d7e8aa34891
Content-Type: application/json

--- request body ---
{"handle":"qa-1d7fef65b404","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c4f1149-3122-4a7f-a503-8d7e8aa34891
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7c4f1149-3122-4a7f-a503-8d7e8aa34891"}
```
