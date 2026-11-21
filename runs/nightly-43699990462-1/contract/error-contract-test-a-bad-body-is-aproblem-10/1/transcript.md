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
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-f74e45f9-ac99-4976-b345-6d7fa4c12112` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-83755122-5ef9-4d1a-bb5a-1f11d07dd721` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-25479c55-ec33-4cfe-9691-102672589712` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-bdbe446e-0c63-4b92-b4f3-965b32ab545f` |
| 5 | `POST /v1/conversations` | 415 | 13 | `qa-e8f75b0a-d0a3-40f0-996c-d1ff28df4f4b` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-b10bf333-1a4a-40b8-9015-0fc996e9cb7a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-6a11d3ea-cecc-48c4-9f14-ca552e7883b2` |
| 8 | `POST /v1/auth/token` | 401 | 40 | `qa-43448104-b217-4858-9426-e0969f35a0f5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-d9b252f0-4014-4620-8d6c-10930924be3b` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-8251db2d-6cef-4d8f-bef4-6669fb4b56d5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f74e45f9-ac99-4976-b345-6d7fa4c12112

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f74e45f9-ac99-4976-b345-6d7fa4c12112
Content-Type: application/json

--- request body ---
{"handle":"qa-bbb221444761","displayName":"QA bbb221444761","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-f74e45f9-ac99-4976-b345-6d7fa4c12112
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 8
Location: /v1/accounts/qa-bbb221444761
X-Served-Region: eu
Content-Length: 181

{"id":"acc_968819ff-19e1-4952-89d5-2d5491c0b6c5","handle":"qa-bbb221444761","displayName":"QA bbb221444761","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.918304179Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-83755122-5ef9-4d1a-bb5a-1f11d07dd721

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83755122-5ef9-4d1a-bb5a-1f11d07dd721
Content-Type: application/json

--- request body ---
{"handle":"qa-d16c83e074e1","displayName":"QA d16c83e074e1","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-83755122-5ef9-4d1a-bb5a-1f11d07dd721
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 8
Location: /v1/accounts/qa-d16c83e074e1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c511206b-c7ed-49a9-a396-5e1d2223d637","handle":"qa-d16c83e074e1","displayName":"QA d16c83e074e1","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.953086984Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-25479c55-ec33-4cfe-9691-102672589712

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25479c55-ec33-4cfe-9691-102672589712
Content-Type: application/json

--- request body ---
{"handle":"qa-bbb221444761","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-25479c55-ec33-4cfe-9691-102672589712
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_968819ff-19e1-4952-89d5-2d5491c0b6c5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bdbe446e-0c63-4b92-b4f3-965b32ab545f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdbe446e-0c63-4b92-b4f3-965b32ab545f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d16c83e074e1","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdbe446e-0c63-4b92-b4f3-965b32ab545f
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
Location: /v1/conversations/cnv_61d5489c-3940-4844-9281-d312b560876e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_61d5489c-3940-4844-9281-d312b560876e","subject":"Error contract","status":"open","region":"eu","participants":["qa-bbb221444761","qa-d16c83e074e1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:10.027432144Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-e8f75b0a-d0a3-40f0-996c-d1ff28df4f4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8f75b0a-d0a3-40f0-996c-d1ff28df4f4b
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e8f75b0a-d0a3-40f0-996c-d1ff28df4f4b
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-e8f75b0a-d0a3-40f0-996c-d1ff28df4f4b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b10bf333-1a4a-40b8-9015-0fc996e9cb7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b10bf333-1a4a-40b8-9015-0fc996e9cb7a
Content-Type: application/json

--- request body ---
{"handle":"qa-d16c83e074e1","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-b10bf333-1a4a-40b8-9015-0fc996e9cb7a
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c511206b-c7ed-49a9-a396-5e1d2223d637"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6a11d3ea-cecc-48c4-9f14-ca552e7883b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a11d3ea-cecc-48c4-9f14-ca552e7883b2
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6a11d3ea-cecc-48c4-9f14-ca552e7883b2
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
correlation: qa-43448104-b217-4858-9426-e0969f35a0f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43448104-b217-4858-9426-e0969f35a0f5
Content-Type: application/json

--- request body ---
{"handle":"qa-d16c83e074e1","password":"****"}

--- response: 401 in 40 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-43448104-b217-4858-9426-e0969f35a0f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-43448104-b217-4858-9426-e0969f35a0f5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d9b252f0-4014-4620-8d6c-10930924be3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9b252f0-4014-4620-8d6c-10930924be3b
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d9b252f0-4014-4620-8d6c-10930924be3b
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
correlation: qa-8251db2d-6cef-4d8f-bef4-6669fb4b56d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8251db2d-6cef-4d8f-bef4-6669fb4b56d5
Content-Type: application/json

--- request body ---
{"handle":"qa-bbb221444761","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8251db2d-6cef-4d8f-bef4-6669fb4b56d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8251db2d-6cef-4d8f-bef4-6669fb4b56d5"}
```
