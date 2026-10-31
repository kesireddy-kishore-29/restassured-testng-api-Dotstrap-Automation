# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 53 | `qa-3829a869-eef6-4150-a32c-5a8b03862c36` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-dbf94dbe-f5f3-4b80-8e06-0e3deedcff6c` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-abe2247e-c657-48a7-9536-c35ecc8b6702` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-a2ca4fd1-acfa-4f18-83a8-1b94c5b0a34e` |
| 5 | `POST /v1/conversations` | 400 | 19 | `qa-3b4509b7-10ee-4d3b-8c8c-708dfa79e1be` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-6bae1987-229a-429f-af0b-345c12e1eb0a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 48 | `qa-f9da0d40-6f1c-4660-be2b-39447ea732aa` |
| 8 | `POST /v1/auth/token` | 401 | 33 | `qa-f651c1f2-a729-4518-853f-e89d930bd75e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-9a118060-41d5-407b-b3f8-4989632a98a3` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-4d46c6d9-6ee0-4290-8984-6d5377f99ab2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3829a869-eef6-4150-a32c-5a8b03862c36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3829a869-eef6-4150-a32c-5a8b03862c36
Content-Type: application/json

--- request body ---
{"handle":"qa-264a4835ff7e","displayName":"QA 264a4835ff7e","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-3829a869-eef6-4150-a32c-5a8b03862c36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 7
Location: /v1/accounts/qa-264a4835ff7e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eb15d757-37b2-4dfd-a178-fa83318f9589","handle":"qa-264a4835ff7e","displayName":"QA 264a4835ff7e","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.177729907Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dbf94dbe-f5f3-4b80-8e06-0e3deedcff6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbf94dbe-f5f3-4b80-8e06-0e3deedcff6c
Content-Type: application/json

--- request body ---
{"handle":"qa-1a46e7c40c78","displayName":"QA 1a46e7c40c78","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbf94dbe-f5f3-4b80-8e06-0e3deedcff6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 7
Location: /v1/accounts/qa-1a46e7c40c78
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bf10cd88-c15e-4469-b5da-3d083047d47e","handle":"qa-1a46e7c40c78","displayName":"QA 1a46e7c40c78","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.239821824Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-abe2247e-c657-48a7-9536-c35ecc8b6702

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abe2247e-c657-48a7-9536-c35ecc8b6702
Content-Type: application/json

--- request body ---
{"handle":"qa-264a4835ff7e","password":"****"}

--- response: 200 in 35 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-abe2247e-c657-48a7-9536-c35ecc8b6702
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb15d757-37b2-4dfd-a178-fa83318f9589"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a2ca4fd1-acfa-4f18-83a8-1b94c5b0a34e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2ca4fd1-acfa-4f18-83a8-1b94c5b0a34e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1a46e7c40c78","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2ca4fd1-acfa-4f18-83a8-1b94c5b0a34e
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
Location: /v1/conversations/cnv_a57bd849-2f61-440a-b01b-18f0fd031336
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a57bd849-2f61-440a-b01b-18f0fd031336","subject":"Error contract","status":"open","region":"eu","participants":["qa-264a4835ff7e","qa-1a46e7c40c78"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.330551844Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-3b4509b7-10ee-4d3b-8c8c-708dfa79e1be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b4509b7-10ee-4d3b-8c8c-708dfa79e1be
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b4509b7-10ee-4d3b-8c8c-708dfa79e1be
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-3b4509b7-10ee-4d3b-8c8c-708dfa79e1be"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6bae1987-229a-429f-af0b-345c12e1eb0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bae1987-229a-429f-af0b-345c12e1eb0a
Content-Type: application/json

--- request body ---
{"handle":"qa-1a46e7c40c78","password":"****"}

--- response: 200 in 32 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bae1987-229a-429f-af0b-345c12e1eb0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bf10cd88-c15e-4469-b5da-3d083047d47e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f9da0d40-6f1c-4660-be2b-39447ea732aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9da0d40-6f1c-4660-be2b-39447ea732aa
Content-Type: application/json

--- response: 204 in 48 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f9da0d40-6f1c-4660-be2b-39447ea732aa
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
correlation: qa-f651c1f2-a729-4518-853f-e89d930bd75e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f651c1f2-a729-4518-853f-e89d930bd75e
Content-Type: application/json

--- request body ---
{"handle":"qa-1a46e7c40c78","password":"****"}

--- response: 401 in 33 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f651c1f2-a729-4518-853f-e89d930bd75e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f651c1f2-a729-4518-853f-e89d930bd75e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9a118060-41d5-407b-b3f8-4989632a98a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a118060-41d5-407b-b3f8-4989632a98a3
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9a118060-41d5-407b-b3f8-4989632a98a3
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
correlation: qa-4d46c6d9-6ee0-4290-8984-6d5377f99ab2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d46c6d9-6ee0-4290-8984-6d5377f99ab2
Content-Type: application/json

--- request body ---
{"handle":"qa-264a4835ff7e","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d46c6d9-6ee0-4290-8984-6d5377f99ab2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4d46c6d9-6ee0-4290-8984-6d5377f99ab2"}
```
