# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-3971bea1-5b5c-4580-907d-dde50fbe04e0` |
| 2 | `POST /v1/auth/token` | 200 | 9 | `qa-924a0b77-2636-4d40-9804-1e15e54b481e` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 8 | `qa-4e12027b-bf29-45e9-980a-f95814f1418a` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-2b1a764b-c418-4e8e-b7ce-43f22c14812c` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-6cb41ff8-9d64-43f4-8597-4289960fe00a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3971bea1-5b5c-4580-907d-dde50fbe04e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3971bea1-5b5c-4580-907d-dde50fbe04e0
Content-Type: application/json

--- request body ---
{"handle":"qa-ccd2b88c35b6","displayName":"QA ccd2b88c35b6","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-3971bea1-5b5c-4580-907d-dde50fbe04e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 7
Location: /v1/accounts/qa-ccd2b88c35b6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_04f524dc-7843-420f-a567-be51cf606a17","handle":"qa-ccd2b88c35b6","displayName":"QA ccd2b88c35b6","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.886545729Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-924a0b77-2636-4d40-9804-1e15e54b481e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-924a0b77-2636-4d40-9804-1e15e54b481e
Content-Type: application/json

--- request body ---
{"handle":"qa-ccd2b88c35b6","password":"****"}

--- response: 200 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-924a0b77-2636-4d40-9804-1e15e54b481e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_04f524dc-7843-420f-a567-be51cf606a17"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-4e12027b-bf29-45e9-980a-f95814f1418a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e12027b-bf29-45e9-980a-f95814f1418a
Content-Type: application/json

--- response: 404 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e12027b-bf29-45e9-980a-f95814f1418a
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
Content-Length: 259

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-4e12027b-bf29-45e9-980a-f95814f1418a"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2b1a764b-c418-4e8e-b7ce-43f22c14812c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b1a764b-c418-4e8e-b7ce-43f22c14812c
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2b1a764b-c418-4e8e-b7ce-43f22c14812c
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-6cb41ff8-9d64-43f4-8597-4289960fe00a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cb41ff8-9d64-43f4-8597-4289960fe00a
Content-Type: application/json

--- request body ---
{"handle":"qa-ccd2b88c35b6","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6cb41ff8-9d64-43f4-8597-4289960fe00a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6cb41ff8-9d64-43f4-8597-4289960fe00a"}
```
