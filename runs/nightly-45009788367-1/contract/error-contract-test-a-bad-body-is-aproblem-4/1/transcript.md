# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-3bee26c0-45ca-4eb3-b823-8fc6fe171348` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-0e0909dc-1e8b-4e37-bc6c-9d7456185f84` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-ee8654e5-42f9-45fe-ba10-f3b15a9d72d4` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-08a1c7ff-385c-4b41-9f2c-95761522eaee` |
| 5 | `POST /v1/accounts` | 415 | 9 | `qa-573ba551-52ee-4870-a456-53b589a83254` |
| 6 | `POST /v1/auth/token` | 200 | 10 | `qa-b30c02c8-0a9e-409b-942e-5d68e8d586d0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-ade1a4b0-29eb-47d1-b95d-bc5d3b33b192` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-154f3404-880f-4dfd-ae08-975ab95a8e1c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-a862f835-3e25-49e5-acf3-6f280cd05857` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-e1b8c7ac-dcb6-4f62-940a-b5ca7cc1c6b2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3bee26c0-45ca-4eb3-b823-8fc6fe171348

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bee26c0-45ca-4eb3-b823-8fc6fe171348
Content-Type: application/json

--- request body ---
{"handle":"qa-6ef5c0ee9191","displayName":"QA 6ef5c0ee9191","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bee26c0-45ca-4eb3-b823-8fc6fe171348
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 9
Location: /v1/accounts/qa-6ef5c0ee9191
X-Served-Region: eu
Content-Length: 181

{"id":"acc_29edb4c9-107c-4212-b32b-9641ab8ed1f4","handle":"qa-6ef5c0ee9191","displayName":"QA 6ef5c0ee9191","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.350713218Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0e0909dc-1e8b-4e37-bc6c-9d7456185f84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e0909dc-1e8b-4e37-bc6c-9d7456185f84
Content-Type: application/json

--- request body ---
{"handle":"qa-826597adaf70","displayName":"QA 826597adaf70","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e0909dc-1e8b-4e37-bc6c-9d7456185f84
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 9
Location: /v1/accounts/qa-826597adaf70
X-Served-Region: eu
Content-Length: 181

{"id":"acc_de7611f1-efde-4c44-8951-19d6dd09445a","handle":"qa-826597adaf70","displayName":"QA 826597adaf70","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.389563514Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ee8654e5-42f9-45fe-ba10-f3b15a9d72d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee8654e5-42f9-45fe-ba10-f3b15a9d72d4
Content-Type: application/json

--- request body ---
{"handle":"qa-6ef5c0ee9191","password":"****"}

--- response: 200 in 42 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee8654e5-42f9-45fe-ba10-f3b15a9d72d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_29edb4c9-107c-4212-b32b-9641ab8ed1f4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-08a1c7ff-385c-4b41-9f2c-95761522eaee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08a1c7ff-385c-4b41-9f2c-95761522eaee
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-826597adaf70","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-08a1c7ff-385c-4b41-9f2c-95761522eaee
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
Location: /v1/conversations/cnv_000d1541-6323-4f4b-8c2e-87f4bb2574f1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_000d1541-6323-4f4b-8c2e-87f4bb2574f1","subject":"Error contract","status":"open","region":"eu","participants":["qa-6ef5c0ee9191","qa-826597adaf70"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:41.491041544Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-573ba551-52ee-4870-a456-53b589a83254

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-573ba551-52ee-4870-a456-53b589a83254
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-573ba551-52ee-4870-a456-53b589a83254
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 9
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-573ba551-52ee-4870-a456-53b589a83254"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b30c02c8-0a9e-409b-942e-5d68e8d586d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b30c02c8-0a9e-409b-942e-5d68e8d586d0
Content-Type: application/json

--- request body ---
{"handle":"qa-826597adaf70","password":"****"}

--- response: 200 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-b30c02c8-0a9e-409b-942e-5d68e8d586d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_de7611f1-efde-4c44-8951-19d6dd09445a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ade1a4b0-29eb-47d1-b95d-bc5d3b33b192

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ade1a4b0-29eb-47d1-b95d-bc5d3b33b192
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ade1a4b0-29eb-47d1-b95d-bc5d3b33b192
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
correlation: qa-154f3404-880f-4dfd-ae08-975ab95a8e1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-154f3404-880f-4dfd-ae08-975ab95a8e1c
Content-Type: application/json

--- request body ---
{"handle":"qa-826597adaf70","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-154f3404-880f-4dfd-ae08-975ab95a8e1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-154f3404-880f-4dfd-ae08-975ab95a8e1c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a862f835-3e25-49e5-acf3-6f280cd05857

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a862f835-3e25-49e5-acf3-6f280cd05857
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a862f835-3e25-49e5-acf3-6f280cd05857
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e1b8c7ac-dcb6-4f62-940a-b5ca7cc1c6b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1b8c7ac-dcb6-4f62-940a-b5ca7cc1c6b2
Content-Type: application/json

--- request body ---
{"handle":"qa-6ef5c0ee9191","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1b8c7ac-dcb6-4f62-940a-b5ca7cc1c6b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e1b8c7ac-dcb6-4f62-940a-b5ca7cc1c6b2"}
```
