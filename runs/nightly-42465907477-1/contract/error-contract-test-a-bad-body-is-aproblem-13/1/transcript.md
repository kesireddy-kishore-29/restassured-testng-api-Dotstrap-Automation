# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-aee6759f-7a19-4002-9174-c5b6df987e21` |
| 2 | `POST /v1/accounts` | 201 | 55 | `qa-5926a678-ed65-43df-9914-f0c85d8b6699` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-17bb4a44-02b2-4b44-b2bc-691b0a032f81` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-1af8f0f3-225f-4600-8d24-831e3046fe04` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 8 | `qa-0e3a1737-60c6-4b53-9787-d8e09930224f` |
| 6 | `POST /v1/auth/token` | 200 | 4 | `qa-b8a082c0-b5b3-4c0e-a643-65d28271ea47` |
| 7 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-56681d1d-15c6-4468-93ca-f201266a41a0` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-58962619-e44f-4eb1-89ce-d44d1fa4efbe` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-a6f3c4c6-cb4e-4c19-bccd-5ced5a499f46` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-9af3fe3f-6887-44f2-9f0a-905a08839d0e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aee6759f-7a19-4002-9174-c5b6df987e21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aee6759f-7a19-4002-9174-c5b6df987e21
Content-Type: application/json

--- request body ---
{"handle":"qa-b316883f49c3","displayName":"QA b316883f49c3","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-aee6759f-7a19-4002-9174-c5b6df987e21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 8
Location: /v1/accounts/qa-b316883f49c3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3df71d24-a995-41ce-8f00-16d53c9cd544","handle":"qa-b316883f49c3","displayName":"QA b316883f49c3","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.361558203Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5926a678-ed65-43df-9914-f0c85d8b6699

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5926a678-ed65-43df-9914-f0c85d8b6699
Content-Type: application/json

--- request body ---
{"handle":"qa-111609a98ad6","displayName":"QA 111609a98ad6","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5926a678-ed65-43df-9914-f0c85d8b6699
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 8
Location: /v1/accounts/qa-111609a98ad6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_496d97e9-c07f-4793-a84f-82733a641ea5","handle":"qa-111609a98ad6","displayName":"QA 111609a98ad6","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.439549866Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-17bb4a44-02b2-4b44-b2bc-691b0a032f81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17bb4a44-02b2-4b44-b2bc-691b0a032f81
Content-Type: application/json

--- request body ---
{"handle":"qa-b316883f49c3","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-17bb4a44-02b2-4b44-b2bc-691b0a032f81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3df71d24-a995-41ce-8f00-16d53c9cd544"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1af8f0f3-225f-4600-8d24-831e3046fe04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1af8f0f3-225f-4600-8d24-831e3046fe04
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-111609a98ad6","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1af8f0f3-225f-4600-8d24-831e3046fe04
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
Location: /v1/conversations/cnv_f882f5d0-651f-40d8-88e5-ccce8b52ed88
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f882f5d0-651f-40d8-88e5-ccce8b52ed88","subject":"Error contract","status":"open","region":"eu","participants":["qa-b316883f49c3","qa-111609a98ad6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:03.481020749Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_f882f5d0-651f-40d8-88e5-ccce8b52ed88/messages
correlation: qa-0e3a1737-60c6-4b53-9787-d8e09930224f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e3a1737-60c6-4b53-9787-d8e09930224f
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e3a1737-60c6-4b53-9787-d8e09930224f
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_f882f5d0-651f-40d8-88e5-ccce8b52ed88/messages","correlationId":"qa-0e3a1737-60c6-4b53-9787-d8e09930224f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b8a082c0-b5b3-4c0e-a643-65d28271ea47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8a082c0-b5b3-4c0e-a643-65d28271ea47
Content-Type: application/json

--- request body ---
{"handle":"qa-111609a98ad6","password":"****"}

--- response: 200 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8a082c0-b5b3-4c0e-a643-65d28271ea47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_496d97e9-c07f-4793-a84f-82733a641ea5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-56681d1d-15c6-4468-93ca-f201266a41a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56681d1d-15c6-4468-93ca-f201266a41a0
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-56681d1d-15c6-4468-93ca-f201266a41a0
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
correlation: qa-58962619-e44f-4eb1-89ce-d44d1fa4efbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58962619-e44f-4eb1-89ce-d44d1fa4efbe
Content-Type: application/json

--- request body ---
{"handle":"qa-111609a98ad6","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58962619-e44f-4eb1-89ce-d44d1fa4efbe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-58962619-e44f-4eb1-89ce-d44d1fa4efbe"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a6f3c4c6-cb4e-4c19-bccd-5ced5a499f46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6f3c4c6-cb4e-4c19-bccd-5ced5a499f46
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a6f3c4c6-cb4e-4c19-bccd-5ced5a499f46
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
correlation: qa-9af3fe3f-6887-44f2-9f0a-905a08839d0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9af3fe3f-6887-44f2-9f0a-905a08839d0e
Content-Type: application/json

--- request body ---
{"handle":"qa-b316883f49c3","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9af3fe3f-6887-44f2-9f0a-905a08839d0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9af3fe3f-6887-44f2-9f0a-905a08839d0e"}
```
