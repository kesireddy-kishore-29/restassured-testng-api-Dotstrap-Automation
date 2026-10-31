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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-7dd84753-c3e6-43f9-a4af-eae027b245d4` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-9549ab0e-a037-4bab-bab5-02fb793b1d45` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-4382a31b-63d8-4004-8199-75b839bcc3ef` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-3ed626d1-b519-43dc-9c59-6e2a04251ea4` |
| 5 | `POST /v1/conversations` | 415 | 6 | `qa-db6eb513-0037-44d3-9485-063149bdb883` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-4158a380-dd0f-4b4a-99e6-e1415d07d92e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-a7bed32b-859e-43c7-9b9b-8957d8a383ac` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-3d523ae9-c75a-4344-a4b1-84c063bc07d4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-d350048c-de73-44e7-8198-36d57b8568fb` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-8ade7b5f-8019-44de-8017-2b1c471f5448` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7dd84753-c3e6-43f9-a4af-eae027b245d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dd84753-c3e6-43f9-a4af-eae027b245d4
Content-Type: application/json

--- request body ---
{"handle":"qa-ce10142f74cf","displayName":"QA ce10142f74cf","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-7dd84753-c3e6-43f9-a4af-eae027b245d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 7
Location: /v1/accounts/qa-ce10142f74cf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3b63f27f-d31a-4ca3-9b22-c0f1015ab7a3","handle":"qa-ce10142f74cf","displayName":"QA ce10142f74cf","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.160452202Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9549ab0e-a037-4bab-bab5-02fb793b1d45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9549ab0e-a037-4bab-bab5-02fb793b1d45
Content-Type: application/json

--- request body ---
{"handle":"qa-a4ef355da06e","displayName":"QA a4ef355da06e","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-9549ab0e-a037-4bab-bab5-02fb793b1d45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 7
Location: /v1/accounts/qa-a4ef355da06e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_28fbab6b-edb7-42b3-a50b-a04841cf7622","handle":"qa-a4ef355da06e","displayName":"QA a4ef355da06e","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.203465770Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4382a31b-63d8-4004-8199-75b839bcc3ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4382a31b-63d8-4004-8199-75b839bcc3ef
Content-Type: application/json

--- request body ---
{"handle":"qa-ce10142f74cf","password":"****"}

--- response: 200 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-4382a31b-63d8-4004-8199-75b839bcc3ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3b63f27f-d31a-4ca3-9b22-c0f1015ab7a3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3ed626d1-b519-43dc-9c59-6e2a04251ea4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ed626d1-b519-43dc-9c59-6e2a04251ea4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a4ef355da06e","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ed626d1-b519-43dc-9c59-6e2a04251ea4
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
Location: /v1/conversations/cnv_60fca881-2923-4417-9241-fd8c4d1d677a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_60fca881-2923-4417-9241-fd8c4d1d677a","subject":"Error contract","status":"open","region":"eu","participants":["qa-ce10142f74cf","qa-a4ef355da06e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.280233887Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-db6eb513-0037-44d3-9485-063149bdb883

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db6eb513-0037-44d3-9485-063149bdb883
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db6eb513-0037-44d3-9485-063149bdb883
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-db6eb513-0037-44d3-9485-063149bdb883"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4158a380-dd0f-4b4a-99e6-e1415d07d92e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4158a380-dd0f-4b4a-99e6-e1415d07d92e
Content-Type: application/json

--- request body ---
{"handle":"qa-a4ef355da06e","password":"****"}

--- response: 200 in 28 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-4158a380-dd0f-4b4a-99e6-e1415d07d92e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_28fbab6b-edb7-42b3-a50b-a04841cf7622"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a7bed32b-859e-43c7-9b9b-8957d8a383ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7bed32b-859e-43c7-9b9b-8957d8a383ac
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a7bed32b-859e-43c7-9b9b-8957d8a383ac
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
correlation: qa-3d523ae9-c75a-4344-a4b1-84c063bc07d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d523ae9-c75a-4344-a4b1-84c063bc07d4
Content-Type: application/json

--- request body ---
{"handle":"qa-a4ef355da06e","password":"****"}

--- response: 401 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d523ae9-c75a-4344-a4b1-84c063bc07d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3d523ae9-c75a-4344-a4b1-84c063bc07d4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d350048c-de73-44e7-8198-36d57b8568fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d350048c-de73-44e7-8198-36d57b8568fb
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d350048c-de73-44e7-8198-36d57b8568fb
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
correlation: qa-8ade7b5f-8019-44de-8017-2b1c471f5448

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ade7b5f-8019-44de-8017-2b1c471f5448
Content-Type: application/json

--- request body ---
{"handle":"qa-ce10142f74cf","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ade7b5f-8019-44de-8017-2b1c471f5448
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8ade7b5f-8019-44de-8017-2b1c471f5448"}
```
