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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-16a85e5c-ad3a-4e7e-9799-3c91805082e3` |
| 2 | `POST /v1/accounts` | 201 | 73 | `qa-ca214f8d-5693-4f01-b8a1-bb20d0036419` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-f003dd8a-721f-4927-8f8e-514013b862d5` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-7921c572-23e1-4d55-a2a1-8cbf92aef3e9` |
| 5 | `POST /v1/accounts` | 400 | 7 | `qa-cebb0c39-b6ee-4fd0-bd6d-190a65e7afdd` |
| 6 | `POST /v1/auth/token` | 200 | 84 | `qa-a9f4b399-1626-49ba-b5f1-2ddc6bf3b397` |
| 7 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-5ed6c3cd-9657-4cc4-8eb6-148fead74e25` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-0b20144b-15d8-41ee-aa28-29b029c1bd77` |
| 9 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-c4e37e93-5409-4b1e-bcc0-3131fe8b429b` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-267e9d81-a839-4412-914b-a465c4c5009a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-16a85e5c-ad3a-4e7e-9799-3c91805082e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16a85e5c-ad3a-4e7e-9799-3c91805082e3
Content-Type: application/json

--- request body ---
{"handle":"qa-43bd7a2ce6de","displayName":"QA 43bd7a2ce6de","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-16a85e5c-ad3a-4e7e-9799-3c91805082e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Location: /v1/accounts/qa-43bd7a2ce6de
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d1ff8196-da41-4f67-a2c5-5c6c4fbbeb13","handle":"qa-43bd7a2ce6de","displayName":"QA 43bd7a2ce6de","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.900297548Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ca214f8d-5693-4f01-b8a1-bb20d0036419

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca214f8d-5693-4f01-b8a1-bb20d0036419
Content-Type: application/json

--- request body ---
{"handle":"qa-a35112a3b7c3","displayName":"QA a35112a3b7c3","password":"****","region":"eu"}

--- response: 201 in 73 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca214f8d-5693-4f01-b8a1-bb20d0036419
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Location: /v1/accounts/qa-a35112a3b7c3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cb6b36ea-a053-4c1f-ab14-c868c87dc50a","handle":"qa-a35112a3b7c3","displayName":"QA a35112a3b7c3","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.990488358Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f003dd8a-721f-4927-8f8e-514013b862d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f003dd8a-721f-4927-8f8e-514013b862d5
Content-Type: application/json

--- request body ---
{"handle":"qa-43bd7a2ce6de","password":"****"}

--- response: 200 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f003dd8a-721f-4927-8f8e-514013b862d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d1ff8196-da41-4f67-a2c5-5c6c4fbbeb13"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7921c572-23e1-4d55-a2a1-8cbf92aef3e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7921c572-23e1-4d55-a2a1-8cbf92aef3e9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a35112a3b7c3","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-7921c572-23e1-4d55-a2a1-8cbf92aef3e9
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
Location: /v1/conversations/cnv_6a8025b2-c4e2-47c8-b2cc-f7aba696546b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6a8025b2-c4e2-47c8-b2cc-f7aba696546b","subject":"Error contract","status":"open","region":"eu","participants":["qa-43bd7a2ce6de","qa-a35112a3b7c3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:52.041987043Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-cebb0c39-b6ee-4fd0-bd6d-190a65e7afdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cebb0c39-b6ee-4fd0-bd6d-190a65e7afdd
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cebb0c39-b6ee-4fd0-bd6d-190a65e7afdd
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
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-cebb0c39-b6ee-4fd0-bd6d-190a65e7afdd"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a9f4b399-1626-49ba-b5f1-2ddc6bf3b397

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9f4b399-1626-49ba-b5f1-2ddc6bf3b397
Content-Type: application/json

--- request body ---
{"handle":"qa-a35112a3b7c3","password":"****"}

--- response: 200 in 84 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9f4b399-1626-49ba-b5f1-2ddc6bf3b397
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cb6b36ea-a053-4c1f-ab14-c868c87dc50a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5ed6c3cd-9657-4cc4-8eb6-148fead74e25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ed6c3cd-9657-4cc4-8eb6-148fead74e25
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5ed6c3cd-9657-4cc4-8eb6-148fead74e25
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
correlation: qa-0b20144b-15d8-41ee-aa28-29b029c1bd77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b20144b-15d8-41ee-aa28-29b029c1bd77
Content-Type: application/json

--- request body ---
{"handle":"qa-a35112a3b7c3","password":"****"}

--- response: 401 in 28 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0b20144b-15d8-41ee-aa28-29b029c1bd77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0b20144b-15d8-41ee-aa28-29b029c1bd77"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c4e37e93-5409-4b1e-bcc0-3131fe8b429b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4e37e93-5409-4b1e-bcc0-3131fe8b429b
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c4e37e93-5409-4b1e-bcc0-3131fe8b429b
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
correlation: qa-267e9d81-a839-4412-914b-a465c4c5009a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-267e9d81-a839-4412-914b-a465c4c5009a
Content-Type: application/json

--- request body ---
{"handle":"qa-43bd7a2ce6de","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-267e9d81-a839-4412-914b-a465c4c5009a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-267e9d81-a839-4412-914b-a465c4c5009a"}
```
