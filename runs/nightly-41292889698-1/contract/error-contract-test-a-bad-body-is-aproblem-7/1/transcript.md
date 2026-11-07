# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-cd5d0ebf-6fae-424c-8ec1-ef0f5152de09` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-533c74a3-f7f9-47a0-aae1-ef53f60a8514` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-cb554f5d-88da-4a70-9de0-a27ee62fb64b` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-743d73a2-5d03-47df-8c0b-52d621bae2b0` |
| 5 | `PATCH /v1/accounts/me` | 415 | 29 | `qa-9a4f8b7f-68d1-4450-a701-17a62e964871` |
| 6 | `POST /v1/auth/token` | 200 | 46 | `qa-68ae3c30-d72f-483f-9526-c27a0463a964` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-65c3c9ad-0319-4f13-addb-93d243002da8` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-fbb7331d-1591-4e46-91a7-ad10b8694ac1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-93ed943a-4841-4ad4-b2da-3418e671437b` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-fb3f7d02-dc1c-46c1-93f1-f49bd4cc39b8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cd5d0ebf-6fae-424c-8ec1-ef0f5152de09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd5d0ebf-6fae-424c-8ec1-ef0f5152de09
Content-Type: application/json

--- request body ---
{"handle":"qa-271479930e7a","displayName":"QA 271479930e7a","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd5d0ebf-6fae-424c-8ec1-ef0f5152de09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 9
Location: /v1/accounts/qa-271479930e7a
X-Served-Region: eu
Content-Length: 178

{"id":"acc_9ac51a83-2713-4f55-8c77-33e0c6985555","handle":"qa-271479930e7a","displayName":"QA 271479930e7a","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.292429Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-533c74a3-f7f9-47a0-aae1-ef53f60a8514

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-533c74a3-f7f9-47a0-aae1-ef53f60a8514
Content-Type: application/json

--- request body ---
{"handle":"qa-95c7abf1306a","displayName":"QA 95c7abf1306a","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-533c74a3-f7f9-47a0-aae1-ef53f60a8514
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
Location: /v1/accounts/qa-95c7abf1306a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b879e0e9-c396-4a34-9f81-3337644fb1f7","handle":"qa-95c7abf1306a","displayName":"QA 95c7abf1306a","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.320445348Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cb554f5d-88da-4a70-9de0-a27ee62fb64b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb554f5d-88da-4a70-9de0-a27ee62fb64b
Content-Type: application/json

--- request body ---
{"handle":"qa-271479930e7a","password":"****"}

--- response: 200 in 39 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb554f5d-88da-4a70-9de0-a27ee62fb64b
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9ac51a83-2713-4f55-8c77-33e0c6985555"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-743d73a2-5d03-47df-8c0b-52d621bae2b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-743d73a2-5d03-47df-8c0b-52d621bae2b0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-95c7abf1306a","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-743d73a2-5d03-47df-8c0b-52d621bae2b0
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
Location: /v1/conversations/cnv_a858f9b5-20b6-43ac-b6ea-7bbd24f9c470
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a858f9b5-20b6-43ac-b6ea-7bbd24f9c470","subject":"Error contract","status":"open","region":"eu","participants":["qa-271479930e7a","qa-95c7abf1306a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:22.431916233Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-9a4f8b7f-68d1-4450-a701-17a62e964871

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a4f8b7f-68d1-4450-a701-17a62e964871
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 29 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a4f8b7f-68d1-4450-a701-17a62e964871
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-9a4f8b7f-68d1-4450-a701-17a62e964871"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-68ae3c30-d72f-483f-9526-c27a0463a964

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68ae3c30-d72f-483f-9526-c27a0463a964
Content-Type: application/json

--- request body ---
{"handle":"qa-95c7abf1306a","password":"****"}

--- response: 200 in 46 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-68ae3c30-d72f-483f-9526-c27a0463a964
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b879e0e9-c396-4a34-9f81-3337644fb1f7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-65c3c9ad-0319-4f13-addb-93d243002da8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65c3c9ad-0319-4f13-addb-93d243002da8
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-65c3c9ad-0319-4f13-addb-93d243002da8
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
correlation: qa-fbb7331d-1591-4e46-91a7-ad10b8694ac1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbb7331d-1591-4e46-91a7-ad10b8694ac1
Content-Type: application/json

--- request body ---
{"handle":"qa-95c7abf1306a","password":"****"}

--- response: 401 in 28 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fbb7331d-1591-4e46-91a7-ad10b8694ac1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fbb7331d-1591-4e46-91a7-ad10b8694ac1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-93ed943a-4841-4ad4-b2da-3418e671437b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93ed943a-4841-4ad4-b2da-3418e671437b
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-93ed943a-4841-4ad4-b2da-3418e671437b
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
correlation: qa-fb3f7d02-dc1c-46c1-93f1-f49bd4cc39b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb3f7d02-dc1c-46c1-93f1-f49bd4cc39b8
Content-Type: application/json

--- request body ---
{"handle":"qa-271479930e7a","password":"****"}

--- response: 401 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb3f7d02-dc1c-46c1-93f1-f49bd4cc39b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fb3f7d02-dc1c-46c1-93f1-f49bd4cc39b8"}
```
