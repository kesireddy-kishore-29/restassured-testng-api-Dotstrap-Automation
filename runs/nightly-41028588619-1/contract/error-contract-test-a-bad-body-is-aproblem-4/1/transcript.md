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
| 1 | `POST /v1/accounts` | 201 | 57 | `qa-080ffd8f-7b6a-49dd-8832-7938d69abdc1` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-6fd7152f-8a0d-4541-ac0f-cbec0069b03c` |
| 3 | `POST /v1/auth/token` | 200 | 53 | `qa-86b60a5c-81f8-4995-8f2c-bfd51374a97d` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-6a8758c6-91ea-4fbd-a7e7-1a69d5345f0f` |
| 5 | `POST /v1/accounts` | 415 | 27 | `qa-b8035a20-3e70-432c-8f26-011bbd21d312` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-9dfa5f5c-63f7-4449-8ae7-87f375d8efb2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-4b1bbdee-835c-409c-a867-32581cd02439` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-89b56d32-98de-4c2e-8942-deb67dac5984` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-26633f39-38d5-4a04-a4f7-98dd6bb6df3e` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-83c40ece-b5e2-45b4-85c6-775cfd32d15f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-080ffd8f-7b6a-49dd-8832-7938d69abdc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-080ffd8f-7b6a-49dd-8832-7938d69abdc1
Content-Type: application/json

--- request body ---
{"handle":"qa-05450928d7f3","displayName":"QA 05450928d7f3","password":"****","region":"eu"}

--- response: 201 in 57 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-080ffd8f-7b6a-49dd-8832-7938d69abdc1
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
Location: /v1/accounts/qa-05450928d7f3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b8a77bf9-6eba-4dcb-9dcc-ca5a83a33581","handle":"qa-05450928d7f3","displayName":"QA 05450928d7f3","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.851338483Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6fd7152f-8a0d-4541-ac0f-cbec0069b03c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fd7152f-8a0d-4541-ac0f-cbec0069b03c
Content-Type: application/json

--- request body ---
{"handle":"qa-24b39e3c9b48","displayName":"QA 24b39e3c9b48","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6fd7152f-8a0d-4541-ac0f-cbec0069b03c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 8
Location: /v1/accounts/qa-24b39e3c9b48
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a6fde674-43af-4649-a7a7-f817b94ba139","handle":"qa-24b39e3c9b48","displayName":"QA 24b39e3c9b48","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.920438652Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-86b60a5c-81f8-4995-8f2c-bfd51374a97d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86b60a5c-81f8-4995-8f2c-bfd51374a97d
Content-Type: application/json

--- request body ---
{"handle":"qa-05450928d7f3","password":"****"}

--- response: 200 in 53 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-86b60a5c-81f8-4995-8f2c-bfd51374a97d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b8a77bf9-6eba-4dcb-9dcc-ca5a83a33581"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6a8758c6-91ea-4fbd-a7e7-1a69d5345f0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a8758c6-91ea-4fbd-a7e7-1a69d5345f0f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-24b39e3c9b48","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a8758c6-91ea-4fbd-a7e7-1a69d5345f0f
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
Location: /v1/conversations/cnv_0c2e434f-9768-4945-b9e9-4ea20c377584
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0c2e434f-9768-4945-b9e9-4ea20c377584","subject":"Error contract","status":"open","region":"eu","participants":["qa-05450928d7f3","qa-24b39e3c9b48"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.032482968Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-b8035a20-3e70-432c-8f26-011bbd21d312

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8035a20-3e70-432c-8f26-011bbd21d312
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 27 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b8035a20-3e70-432c-8f26-011bbd21d312
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-b8035a20-3e70-432c-8f26-011bbd21d312"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9dfa5f5c-63f7-4449-8ae7-87f375d8efb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dfa5f5c-63f7-4449-8ae7-87f375d8efb2
Content-Type: application/json

--- request body ---
{"handle":"qa-24b39e3c9b48","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-9dfa5f5c-63f7-4449-8ae7-87f375d8efb2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a6fde674-43af-4649-a7a7-f817b94ba139"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4b1bbdee-835c-409c-a867-32581cd02439

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b1bbdee-835c-409c-a867-32581cd02439
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4b1bbdee-835c-409c-a867-32581cd02439
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
correlation: qa-89b56d32-98de-4c2e-8942-deb67dac5984

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89b56d32-98de-4c2e-8942-deb67dac5984
Content-Type: application/json

--- request body ---
{"handle":"qa-24b39e3c9b48","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-89b56d32-98de-4c2e-8942-deb67dac5984
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-89b56d32-98de-4c2e-8942-deb67dac5984"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-26633f39-38d5-4a04-a4f7-98dd6bb6df3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26633f39-38d5-4a04-a4f7-98dd6bb6df3e
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-26633f39-38d5-4a04-a4f7-98dd6bb6df3e
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
correlation: qa-83c40ece-b5e2-45b4-85c6-775cfd32d15f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83c40ece-b5e2-45b4-85c6-775cfd32d15f
Content-Type: application/json

--- request body ---
{"handle":"qa-05450928d7f3","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-83c40ece-b5e2-45b4-85c6-775cfd32d15f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-83c40ece-b5e2-45b4-85c6-775cfd32d15f"}
```
