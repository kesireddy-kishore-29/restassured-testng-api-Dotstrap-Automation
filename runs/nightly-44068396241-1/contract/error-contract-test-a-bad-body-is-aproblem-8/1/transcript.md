# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-8d328293-064a-4142-bc15-1dee9df7de75` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-7723ead5-0326-4fd9-ab6f-93676d0880d3` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-61456440-cc38-4efa-b031-a0228bff0938` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-ff1cdf48-dfaf-4a22-a0aa-33f45241a010` |
| 5 | `PATCH /v1/accounts/me` | 422 | 14 | `qa-92aaa5ee-da77-45d4-b430-de8dcc0a9418` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-34b9ea82-28ad-45a9-9837-a1e405e14044` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-8e01502a-018d-469d-aa9b-26e127b52ce5` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-0e6ca707-a484-4291-983a-e308d63fd523` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-4e7d1588-be4f-4dfe-84eb-7f0dc272f2c0` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-1dab07b1-7397-4cf3-91ee-ff0ed117a650` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8d328293-064a-4142-bc15-1dee9df7de75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d328293-064a-4142-bc15-1dee9df7de75
Content-Type: application/json

--- request body ---
{"handle":"qa-e59bc3d7a2dd","displayName":"QA e59bc3d7a2dd","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d328293-064a-4142-bc15-1dee9df7de75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 8
Location: /v1/accounts/qa-e59bc3d7a2dd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c5bf1cea-4c06-4521-a0b1-c929d41c725e","handle":"qa-e59bc3d7a2dd","displayName":"QA e59bc3d7a2dd","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.305587932Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7723ead5-0326-4fd9-ab6f-93676d0880d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7723ead5-0326-4fd9-ab6f-93676d0880d3
Content-Type: application/json

--- request body ---
{"handle":"qa-45d22f8cccf4","displayName":"QA 45d22f8cccf4","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-7723ead5-0326-4fd9-ab6f-93676d0880d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 8
Location: /v1/accounts/qa-45d22f8cccf4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5bfed920-f961-4e7c-9edc-0ba302d6c661","handle":"qa-45d22f8cccf4","displayName":"QA 45d22f8cccf4","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.356930845Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-61456440-cc38-4efa-b031-a0228bff0938

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61456440-cc38-4efa-b031-a0228bff0938
Content-Type: application/json

--- request body ---
{"handle":"qa-e59bc3d7a2dd","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-61456440-cc38-4efa-b031-a0228bff0938
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c5bf1cea-4c06-4521-a0b1-c929d41c725e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ff1cdf48-dfaf-4a22-a0aa-33f45241a010

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff1cdf48-dfaf-4a22-a0aa-33f45241a010
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-45d22f8cccf4","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff1cdf48-dfaf-4a22-a0aa-33f45241a010
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
Location: /v1/conversations/cnv_300858af-2826-4a0a-a65c-f70751ef6c55
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_300858af-2826-4a0a-a65c-f70751ef6c55","subject":"Error contract","status":"open","region":"eu","participants":["qa-e59bc3d7a2dd","qa-45d22f8cccf4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.438276559Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-92aaa5ee-da77-45d4-b430-de8dcc0a9418

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92aaa5ee-da77-45d4-b430-de8dcc0a9418
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92aaa5ee-da77-45d4-b430-de8dcc0a9418
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-92aaa5ee-da77-45d4-b430-de8dcc0a9418","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-34b9ea82-28ad-45a9-9837-a1e405e14044

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34b9ea82-28ad-45a9-9837-a1e405e14044
Content-Type: application/json

--- request body ---
{"handle":"qa-45d22f8cccf4","password":"****"}

--- response: 200 in 24 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-34b9ea82-28ad-45a9-9837-a1e405e14044
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5bfed920-f961-4e7c-9edc-0ba302d6c661"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e01502a-018d-469d-aa9b-26e127b52ce5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e01502a-018d-469d-aa9b-26e127b52ce5
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e01502a-018d-469d-aa9b-26e127b52ce5
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
correlation: qa-0e6ca707-a484-4291-983a-e308d63fd523

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e6ca707-a484-4291-983a-e308d63fd523
Content-Type: application/json

--- request body ---
{"handle":"qa-45d22f8cccf4","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e6ca707-a484-4291-983a-e308d63fd523
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0e6ca707-a484-4291-983a-e308d63fd523"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4e7d1588-be4f-4dfe-84eb-7f0dc272f2c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e7d1588-be4f-4dfe-84eb-7f0dc272f2c0
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4e7d1588-be4f-4dfe-84eb-7f0dc272f2c0
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
correlation: qa-1dab07b1-7397-4cf3-91ee-ff0ed117a650

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dab07b1-7397-4cf3-91ee-ff0ed117a650
Content-Type: application/json

--- request body ---
{"handle":"qa-e59bc3d7a2dd","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1dab07b1-7397-4cf3-91ee-ff0ed117a650
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1dab07b1-7397-4cf3-91ee-ff0ed117a650"}
```
