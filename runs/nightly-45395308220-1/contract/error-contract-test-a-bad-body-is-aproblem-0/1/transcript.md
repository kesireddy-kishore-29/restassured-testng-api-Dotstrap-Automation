# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-08874da6-8c1d-4f23-97d3-d0b37294f6e1` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-d246a138-7d27-4335-96b9-8a504be267c5` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-ab29f9f3-5e2b-4a9d-b47e-5daa0be2c9c1` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-bcfd0723-f250-4dc8-b5e9-2fdcab28b6c5` |
| 5 | `POST /v1/auth/token` | 400 | 10 | `qa-61ac8bc8-6d66-49eb-ad68-cc652897c98f` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-592c53f6-6172-4fed-9f89-d40261fa13e5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-f1b125f1-ed34-469a-843a-2be18eee02c0` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-b1ac4f78-04b3-40b2-803f-73a4c3f96c4a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-6dd03e48-0720-48a6-80fc-17c3fefcebe8` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-968c65b6-8f06-4ce9-b780-8d30e323557b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-08874da6-8c1d-4f23-97d3-d0b37294f6e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08874da6-8c1d-4f23-97d3-d0b37294f6e1
Content-Type: application/json

--- request body ---
{"handle":"qa-dd76fcf00ee9","displayName":"QA dd76fcf00ee9","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-08874da6-8c1d-4f23-97d3-d0b37294f6e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Location: /v1/accounts/qa-dd76fcf00ee9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e044a36-e7df-41bd-8502-382949824ea7","handle":"qa-dd76fcf00ee9","displayName":"QA dd76fcf00ee9","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.141006406Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d246a138-7d27-4335-96b9-8a504be267c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d246a138-7d27-4335-96b9-8a504be267c5
Content-Type: application/json

--- request body ---
{"handle":"qa-a018920c9c09","displayName":"QA a018920c9c09","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-d246a138-7d27-4335-96b9-8a504be267c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Location: /v1/accounts/qa-a018920c9c09
X-Served-Region: eu
Content-Length: 181

{"id":"acc_91b1a4d8-c9ba-43d7-bb2d-2efa5b8c39b2","handle":"qa-a018920c9c09","displayName":"QA a018920c9c09","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.212557803Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ab29f9f3-5e2b-4a9d-b47e-5daa0be2c9c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab29f9f3-5e2b-4a9d-b47e-5daa0be2c9c1
Content-Type: application/json

--- request body ---
{"handle":"qa-dd76fcf00ee9","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab29f9f3-5e2b-4a9d-b47e-5daa0be2c9c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6e044a36-e7df-41bd-8502-382949824ea7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bcfd0723-f250-4dc8-b5e9-2fdcab28b6c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcfd0723-f250-4dc8-b5e9-2fdcab28b6c5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a018920c9c09","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcfd0723-f250-4dc8-b5e9-2fdcab28b6c5
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
Location: /v1/conversations/cnv_a74fa2f3-327e-441f-96a9-03842dcfe2ed
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a74fa2f3-327e-441f-96a9-03842dcfe2ed","subject":"Error contract","status":"open","region":"eu","participants":["qa-dd76fcf00ee9","qa-a018920c9c09"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:13.284412902Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-61ac8bc8-6d66-49eb-ad68-cc652897c98f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61ac8bc8-6d66-49eb-ad68-cc652897c98f
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61ac8bc8-6d66-49eb-ad68-cc652897c98f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 9
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-61ac8bc8-6d66-49eb-ad68-cc652897c98f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-592c53f6-6172-4fed-9f89-d40261fa13e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-592c53f6-6172-4fed-9f89-d40261fa13e5
Content-Type: application/json

--- request body ---
{"handle":"qa-a018920c9c09","password":"****"}

--- response: 200 in 36 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-592c53f6-6172-4fed-9f89-d40261fa13e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_91b1a4d8-c9ba-43d7-bb2d-2efa5b8c39b2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f1b125f1-ed34-469a-843a-2be18eee02c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1b125f1-ed34-469a-843a-2be18eee02c0
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f1b125f1-ed34-469a-843a-2be18eee02c0
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
correlation: qa-b1ac4f78-04b3-40b2-803f-73a4c3f96c4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1ac4f78-04b3-40b2-803f-73a4c3f96c4a
Content-Type: application/json

--- request body ---
{"handle":"qa-a018920c9c09","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1ac4f78-04b3-40b2-803f-73a4c3f96c4a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b1ac4f78-04b3-40b2-803f-73a4c3f96c4a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6dd03e48-0720-48a6-80fc-17c3fefcebe8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dd03e48-0720-48a6-80fc-17c3fefcebe8
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6dd03e48-0720-48a6-80fc-17c3fefcebe8
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
correlation: qa-968c65b6-8f06-4ce9-b780-8d30e323557b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-968c65b6-8f06-4ce9-b780-8d30e323557b
Content-Type: application/json

--- request body ---
{"handle":"qa-dd76fcf00ee9","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-968c65b6-8f06-4ce9-b780-8d30e323557b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-968c65b6-8f06-4ce9-b780-8d30e323557b"}
```
