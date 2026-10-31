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
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-5e0d7290-c22f-494f-b29f-29505dd2751e` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-d16141d7-c497-45a4-9e2a-37a0340971ef` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-5dc4311e-0236-4596-be0d-11bbaed7f00d` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-67dd98b5-5f3d-4595-8311-abf47fbc584c` |
| 5 | `POST /v1/accounts` | 400 | 16 | `qa-bdec7611-d80b-4382-9b31-573953ba9f47` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-7263f66d-4480-434f-b40a-01acfc770723` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-9d729f11-f32a-4d2b-bee5-d56acc4259b9` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-a4c6d4f4-3fe0-4cbd-b6ca-5a060334e454` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-0dbae5af-38ff-4d39-a15d-fc50836116da` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-f2125ab3-83ba-4af2-adee-8886cf0f134a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5e0d7290-c22f-494f-b29f-29505dd2751e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e0d7290-c22f-494f-b29f-29505dd2751e
Content-Type: application/json

--- request body ---
{"handle":"qa-3b6c74f631f8","displayName":"QA 3b6c74f631f8","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e0d7290-c22f-494f-b29f-29505dd2751e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Location: /v1/accounts/qa-3b6c74f631f8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a4b4d7af-5e30-4210-b48d-cd18ec42bd21","handle":"qa-3b6c74f631f8","displayName":"QA 3b6c74f631f8","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.333716608Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d16141d7-c497-45a4-9e2a-37a0340971ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d16141d7-c497-45a4-9e2a-37a0340971ef
Content-Type: application/json

--- request body ---
{"handle":"qa-ed069c0addee","displayName":"QA ed069c0addee","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-d16141d7-c497-45a4-9e2a-37a0340971ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Location: /v1/accounts/qa-ed069c0addee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e9fa843-0fc1-4ec1-95bd-a85430fbc1b9","handle":"qa-ed069c0addee","displayName":"QA ed069c0addee","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.382785097Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5dc4311e-0236-4596-be0d-11bbaed7f00d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dc4311e-0236-4596-be0d-11bbaed7f00d
Content-Type: application/json

--- request body ---
{"handle":"qa-3b6c74f631f8","password":"****"}

--- response: 200 in 31 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-5dc4311e-0236-4596-be0d-11bbaed7f00d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4b4d7af-5e30-4210-b48d-cd18ec42bd21"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-67dd98b5-5f3d-4595-8311-abf47fbc584c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67dd98b5-5f3d-4595-8311-abf47fbc584c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ed069c0addee","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-67dd98b5-5f3d-4595-8311-abf47fbc584c
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
Location: /v1/conversations/cnv_ebaac8cb-4480-4d99-990d-801db913148e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ebaac8cb-4480-4d99-990d-801db913148e","subject":"Error contract","status":"open","region":"eu","participants":["qa-3b6c74f631f8","qa-ed069c0addee"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:51.449469780Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-bdec7611-d80b-4382-9b31-573953ba9f47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdec7611-d80b-4382-9b31-573953ba9f47
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bdec7611-d80b-4382-9b31-573953ba9f47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 10
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-bdec7611-d80b-4382-9b31-573953ba9f47"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7263f66d-4480-434f-b40a-01acfc770723

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7263f66d-4480-434f-b40a-01acfc770723
Content-Type: application/json

--- request body ---
{"handle":"qa-ed069c0addee","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-7263f66d-4480-434f-b40a-01acfc770723
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6e9fa843-0fc1-4ec1-95bd-a85430fbc1b9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9d729f11-f32a-4d2b-bee5-d56acc4259b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d729f11-f32a-4d2b-bee5-d56acc4259b9
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9d729f11-f32a-4d2b-bee5-d56acc4259b9
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
correlation: qa-a4c6d4f4-3fe0-4cbd-b6ca-5a060334e454

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4c6d4f4-3fe0-4cbd-b6ca-5a060334e454
Content-Type: application/json

--- request body ---
{"handle":"qa-ed069c0addee","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4c6d4f4-3fe0-4cbd-b6ca-5a060334e454
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a4c6d4f4-3fe0-4cbd-b6ca-5a060334e454"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0dbae5af-38ff-4d39-a15d-fc50836116da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dbae5af-38ff-4d39-a15d-fc50836116da
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0dbae5af-38ff-4d39-a15d-fc50836116da
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
correlation: qa-f2125ab3-83ba-4af2-adee-8886cf0f134a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2125ab3-83ba-4af2-adee-8886cf0f134a
Content-Type: application/json

--- request body ---
{"handle":"qa-3b6c74f631f8","password":"****"}

--- response: 401 in 21 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2125ab3-83ba-4af2-adee-8886cf0f134a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f2125ab3-83ba-4af2-adee-8886cf0f134a"}
```
