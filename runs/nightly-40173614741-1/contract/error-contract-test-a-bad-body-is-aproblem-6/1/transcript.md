# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-61bd7ca9-9741-4c26-9b7f-3ee37e68a5e8` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-8beffd7b-6614-480e-b718-86aafc18fe98` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-8055a115-8766-416a-960f-07dc91dce34e` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-84838e3a-b4e3-4ad5-a504-bfed4170194a` |
| 5 | `PATCH /v1/accounts/me` | 400 | 11 | `qa-571df425-82ec-41d5-9b13-7b03cee2e8ac` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-99857c71-7644-4098-bece-feec93c3f11e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-ab0d82b0-6f28-4167-b2b1-6f37923c21bf` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-4f6c3b1e-053c-47c9-8840-b742c96f7723` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-bcf4c603-4a93-4f6f-867e-bdfce17c9a44` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-c54c8b7a-dd85-4ec0-b62b-155907b23a35` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-61bd7ca9-9741-4c26-9b7f-3ee37e68a5e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61bd7ca9-9741-4c26-9b7f-3ee37e68a5e8
Content-Type: application/json

--- request body ---
{"handle":"qa-799b27580a54","displayName":"QA 799b27580a54","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-61bd7ca9-9741-4c26-9b7f-3ee37e68a5e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Location: /v1/accounts/qa-799b27580a54
X-Served-Region: eu
Content-Length: 181

{"id":"acc_14ccc74e-301b-4df0-998f-e8f812491f2c","handle":"qa-799b27580a54","displayName":"QA 799b27580a54","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.655257099Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8beffd7b-6614-480e-b718-86aafc18fe98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8beffd7b-6614-480e-b718-86aafc18fe98
Content-Type: application/json

--- request body ---
{"handle":"qa-9a2beb8f6f0c","displayName":"QA 9a2beb8f6f0c","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-8beffd7b-6614-480e-b718-86aafc18fe98
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
Location: /v1/accounts/qa-9a2beb8f6f0c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c232ea6f-634c-476f-bcb3-eafbaf89b230","handle":"qa-9a2beb8f6f0c","displayName":"QA 9a2beb8f6f0c","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.689114332Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8055a115-8766-416a-960f-07dc91dce34e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8055a115-8766-416a-960f-07dc91dce34e
Content-Type: application/json

--- request body ---
{"handle":"qa-799b27580a54","password":"****"}

--- response: 200 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-8055a115-8766-416a-960f-07dc91dce34e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_14ccc74e-301b-4df0-998f-e8f812491f2c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-84838e3a-b4e3-4ad5-a504-bfed4170194a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84838e3a-b4e3-4ad5-a504-bfed4170194a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9a2beb8f6f0c","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-84838e3a-b4e3-4ad5-a504-bfed4170194a
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
Location: /v1/conversations/cnv_96eca666-2a48-4a33-a531-f5bd13d57717
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_96eca666-2a48-4a33-a531-f5bd13d57717","subject":"Error contract","status":"open","region":"eu","participants":["qa-799b27580a54","qa-9a2beb8f6f0c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:25.764756090Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-571df425-82ec-41d5-9b13-7b03cee2e8ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-571df425-82ec-41d5-9b13-7b03cee2e8ac
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-571df425-82ec-41d5-9b13-7b03cee2e8ac
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-571df425-82ec-41d5-9b13-7b03cee2e8ac"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-99857c71-7644-4098-bece-feec93c3f11e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99857c71-7644-4098-bece-feec93c3f11e
Content-Type: application/json

--- request body ---
{"handle":"qa-9a2beb8f6f0c","password":"****"}

--- response: 200 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-99857c71-7644-4098-bece-feec93c3f11e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c232ea6f-634c-476f-bcb3-eafbaf89b230"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ab0d82b0-6f28-4167-b2b1-6f37923c21bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab0d82b0-6f28-4167-b2b1-6f37923c21bf
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ab0d82b0-6f28-4167-b2b1-6f37923c21bf
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
correlation: qa-4f6c3b1e-053c-47c9-8840-b742c96f7723

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f6c3b1e-053c-47c9-8840-b742c96f7723
Content-Type: application/json

--- request body ---
{"handle":"qa-9a2beb8f6f0c","password":"****"}

--- response: 401 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f6c3b1e-053c-47c9-8840-b742c96f7723
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4f6c3b1e-053c-47c9-8840-b742c96f7723"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bcf4c603-4a93-4f6f-867e-bdfce17c9a44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcf4c603-4a93-4f6f-867e-bdfce17c9a44
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bcf4c603-4a93-4f6f-867e-bdfce17c9a44
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
correlation: qa-c54c8b7a-dd85-4ec0-b62b-155907b23a35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c54c8b7a-dd85-4ec0-b62b-155907b23a35
Content-Type: application/json

--- request body ---
{"handle":"qa-799b27580a54","password":"****"}

--- response: 401 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c54c8b7a-dd85-4ec0-b62b-155907b23a35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c54c8b7a-dd85-4ec0-b62b-155907b23a35"}
```
