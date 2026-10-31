# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 51 | `qa-a9d427ad-103e-4998-b7ed-cba4551e6603` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-9ccdc7cb-36e6-4d7f-86e9-251782559436` |
| 3 | `POST /v1/auth/token` | 200 | 50 | `qa-c1e2452f-92b0-41fe-88fc-a7ca5a771f8a` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-91340d89-8fe8-4d8a-8443-c8ab7fc47a9e` |
| 5 | `POST /v1/accounts` | 400 | 25 | `qa-198b21e5-7eaa-4263-8d06-a11f1eb05e79` |
| 6 | `POST /v1/auth/token` | 200 | 61 | `qa-e777d0ac-8bf1-436c-a767-418d9997dc53` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-52c57e1d-4ba2-466c-85e5-6ec4f2e7dbaa` |
| 8 | `POST /v1/auth/token` | 401 | 62 | `qa-38ab736d-71c0-4602-bfa5-2a7f502b90fe` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-d2773a06-d5de-435e-a8d8-182d79a3edb1` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-d2e8d49b-671c-4abc-8811-ce5fd37a639c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a9d427ad-103e-4998-b7ed-cba4551e6603

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9d427ad-103e-4998-b7ed-cba4551e6603
Content-Type: application/json

--- request body ---
{"handle":"qa-17c2442ce210","displayName":"QA 17c2442ce210","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9d427ad-103e-4998-b7ed-cba4551e6603
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-17c2442ce210
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1bb85353-234c-4991-b2c1-1e561708bea4","handle":"qa-17c2442ce210","displayName":"QA 17c2442ce210","region":"eu","role":"user","createdAt":"2026-10-23T07:41:43.715871175Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9ccdc7cb-36e6-4d7f-86e9-251782559436

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ccdc7cb-36e6-4d7f-86e9-251782559436
Content-Type: application/json

--- request body ---
{"handle":"qa-d65a3cb738f3","displayName":"QA d65a3cb738f3","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ccdc7cb-36e6-4d7f-86e9-251782559436
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-d65a3cb738f3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_06822700-e62d-4090-b783-301fa0b17d9c","handle":"qa-d65a3cb738f3","displayName":"QA d65a3cb738f3","region":"eu","role":"user","createdAt":"2026-10-23T07:41:43.787121311Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c1e2452f-92b0-41fe-88fc-a7ca5a771f8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1e2452f-92b0-41fe-88fc-a7ca5a771f8a
Content-Type: application/json

--- request body ---
{"handle":"qa-17c2442ce210","password":"****"}

--- response: 200 in 50 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1e2452f-92b0-41fe-88fc-a7ca5a771f8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1bb85353-234c-4991-b2c1-1e561708bea4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-91340d89-8fe8-4d8a-8443-c8ab7fc47a9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91340d89-8fe8-4d8a-8443-c8ab7fc47a9e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d65a3cb738f3","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-91340d89-8fe8-4d8a-8443-c8ab7fc47a9e
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
Location: /v1/conversations/cnv_e807e449-66c3-471f-8a02-42d863e50e83
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e807e449-66c3-471f-8a02-42d863e50e83","subject":"Error contract","status":"open","region":"eu","participants":["qa-17c2442ce210","qa-d65a3cb738f3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:43.903707226Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-198b21e5-7eaa-4263-8d06-a11f1eb05e79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-198b21e5-7eaa-4263-8d06-a11f1eb05e79
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-198b21e5-7eaa-4263-8d06-a11f1eb05e79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-198b21e5-7eaa-4263-8d06-a11f1eb05e79"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e777d0ac-8bf1-436c-a767-418d9997dc53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e777d0ac-8bf1-436c-a767-418d9997dc53
Content-Type: application/json

--- request body ---
{"handle":"qa-d65a3cb738f3","password":"****"}

--- response: 200 in 61 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-e777d0ac-8bf1-436c-a767-418d9997dc53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_06822700-e62d-4090-b783-301fa0b17d9c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-52c57e1d-4ba2-466c-85e5-6ec4f2e7dbaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52c57e1d-4ba2-466c-85e5-6ec4f2e7dbaa
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-52c57e1d-4ba2-466c-85e5-6ec4f2e7dbaa
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
correlation: qa-38ab736d-71c0-4602-bfa5-2a7f502b90fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38ab736d-71c0-4602-bfa5-2a7f502b90fe
Content-Type: application/json

--- request body ---
{"handle":"qa-d65a3cb738f3","password":"****"}

--- response: 401 in 62 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-38ab736d-71c0-4602-bfa5-2a7f502b90fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-38ab736d-71c0-4602-bfa5-2a7f502b90fe"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d2773a06-d5de-435e-a8d8-182d79a3edb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2773a06-d5de-435e-a8d8-182d79a3edb1
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d2773a06-d5de-435e-a8d8-182d79a3edb1
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
correlation: qa-d2e8d49b-671c-4abc-8811-ce5fd37a639c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2e8d49b-671c-4abc-8811-ce5fd37a639c
Content-Type: application/json

--- request body ---
{"handle":"qa-17c2442ce210","password":"****"}

--- response: 401 in 27 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2e8d49b-671c-4abc-8811-ce5fd37a639c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d2e8d49b-671c-4abc-8811-ce5fd37a639c"}
```
