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
| 1 | `POST /v1/accounts` | 201 | 56 | `qa-2ff8ad16-0893-4353-b5aa-508bcdcafbad` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-13c8812c-bdc8-40dc-ab95-a0ee2e46d339` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-5d4105dc-8946-4369-a42a-5a823f421fcc` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-9c1b1e68-fd83-47eb-83b1-2ed1066203b1` |
| 5 | `PATCH /v1/accounts/me` | 422 | 25 | `qa-9ac46121-e14a-48ab-9a36-18c67f6a02e4` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-11601da9-9a00-483c-bb38-f96e3b457e4b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-b1678845-66db-4372-a171-258f7664b7dd` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-f01019b0-fa90-4bdd-9d07-1618b77036c8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-19818746-9f94-4dd7-8d97-bd12cc7abb51` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-2439684d-f487-4750-91a6-9b52febb5c11` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2ff8ad16-0893-4353-b5aa-508bcdcafbad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ff8ad16-0893-4353-b5aa-508bcdcafbad
Content-Type: application/json

--- request body ---
{"handle":"qa-5d071716a43f","displayName":"QA 5d071716a43f","password":"****","region":"eu"}

--- response: 201 in 56 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ff8ad16-0893-4353-b5aa-508bcdcafbad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 7
Location: /v1/accounts/qa-5d071716a43f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9ccc8943-8465-405e-bd0d-0bb372710689","handle":"qa-5d071716a43f","displayName":"QA 5d071716a43f","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.581729206Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-13c8812c-bdc8-40dc-ab95-a0ee2e46d339

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13c8812c-bdc8-40dc-ab95-a0ee2e46d339
Content-Type: application/json

--- request body ---
{"handle":"qa-1af5142e478d","displayName":"QA 1af5142e478d","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-13c8812c-bdc8-40dc-ab95-a0ee2e46d339
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 7
Location: /v1/accounts/qa-1af5142e478d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fad50b4e-e6de-48f9-80f3-d0f2d63f3726","handle":"qa-1af5142e478d","displayName":"QA 1af5142e478d","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.662996453Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5d4105dc-8946-4369-a42a-5a823f421fcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d4105dc-8946-4369-a42a-5a823f421fcc
Content-Type: application/json

--- request body ---
{"handle":"qa-5d071716a43f","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d4105dc-8946-4369-a42a-5a823f421fcc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9ccc8943-8465-405e-bd0d-0bb372710689"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9c1b1e68-fd83-47eb-83b1-2ed1066203b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c1b1e68-fd83-47eb-83b1-2ed1066203b1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1af5142e478d","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c1b1e68-fd83-47eb-83b1-2ed1066203b1
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
Location: /v1/conversations/cnv_464e945b-5e89-4821-b5d2-0e184537b623
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_464e945b-5e89-4821-b5d2-0e184537b623","subject":"Error contract","status":"open","region":"eu","participants":["qa-5d071716a43f","qa-1af5142e478d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:11.754090948Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-9ac46121-e14a-48ab-9a36-18c67f6a02e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ac46121-e14a-48ab-9a36-18c67f6a02e4
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ac46121-e14a-48ab-9a36-18c67f6a02e4
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-9ac46121-e14a-48ab-9a36-18c67f6a02e4","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-11601da9-9a00-483c-bb38-f96e3b457e4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11601da9-9a00-483c-bb38-f96e3b457e4b
Content-Type: application/json

--- request body ---
{"handle":"qa-1af5142e478d","password":"****"}

--- response: 200 in 41 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-11601da9-9a00-483c-bb38-f96e3b457e4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fad50b4e-e6de-48f9-80f3-d0f2d63f3726"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b1678845-66db-4372-a171-258f7664b7dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1678845-66db-4372-a171-258f7664b7dd
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b1678845-66db-4372-a171-258f7664b7dd
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
correlation: qa-f01019b0-fa90-4bdd-9d07-1618b77036c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f01019b0-fa90-4bdd-9d07-1618b77036c8
Content-Type: application/json

--- request body ---
{"handle":"qa-1af5142e478d","password":"****"}

--- response: 401 in 22 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f01019b0-fa90-4bdd-9d07-1618b77036c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f01019b0-fa90-4bdd-9d07-1618b77036c8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-19818746-9f94-4dd7-8d97-bd12cc7abb51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19818746-9f94-4dd7-8d97-bd12cc7abb51
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-19818746-9f94-4dd7-8d97-bd12cc7abb51
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
correlation: qa-2439684d-f487-4750-91a6-9b52febb5c11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2439684d-f487-4750-91a6-9b52febb5c11
Content-Type: application/json

--- request body ---
{"handle":"qa-5d071716a43f","password":"****"}

--- response: 401 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2439684d-f487-4750-91a6-9b52febb5c11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2439684d-f487-4750-91a6-9b52febb5c11"}
```
