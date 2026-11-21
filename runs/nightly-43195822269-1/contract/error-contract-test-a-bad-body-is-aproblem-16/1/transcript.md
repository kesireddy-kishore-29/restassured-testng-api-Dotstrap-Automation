# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-572270e9-281a-4091-8611-5ef372665c3c` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-9777cd0d-e0a3-4b2d-9935-91bd881fdaaf` |
| 3 | `POST /v1/auth/token` | 200 | 11 | `qa-217f655e-d5d0-453c-8a27-23887b4242e4` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-f39825a9-0899-4581-9002-5c80031c52e1` |
| 5 | `POST /v1/credits/purchases` | 415 | 8 | `qa-1a2436aa-7b07-4add-9e32-e37995716fe0` |
| 6 | `POST /v1/auth/token` | 200 | 8 | `qa-176f501e-4c97-4435-90d5-f41ba6499e2c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-11612bef-9284-4012-90ab-226f41587844` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-58d3c663-faea-480b-97f5-7744e5059747` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-78359a96-7533-4d81-8a4a-a267386a96c1` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-73bee5ea-69c5-480b-b7f6-cf49df89d06a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-572270e9-281a-4091-8611-5ef372665c3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-572270e9-281a-4091-8611-5ef372665c3c
Content-Type: application/json

--- request body ---
{"handle":"qa-34eda0393ce8","displayName":"QA 34eda0393ce8","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-572270e9-281a-4091-8611-5ef372665c3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 8
Location: /v1/accounts/qa-34eda0393ce8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6bd4b7b8-6668-45f1-b469-8b163722c680","handle":"qa-34eda0393ce8","displayName":"QA 34eda0393ce8","region":"eu","role":"user","createdAt":"2026-11-12T09:56:32.176692170Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9777cd0d-e0a3-4b2d-9935-91bd881fdaaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9777cd0d-e0a3-4b2d-9935-91bd881fdaaf
Content-Type: application/json

--- request body ---
{"handle":"qa-87697445803a","displayName":"QA 87697445803a","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-9777cd0d-e0a3-4b2d-9935-91bd881fdaaf
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
Location: /v1/accounts/qa-87697445803a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_989f8134-567d-4ba5-b703-d3ad57600609","handle":"qa-87697445803a","displayName":"QA 87697445803a","region":"eu","role":"user","createdAt":"2026-11-12T09:56:32.199583876Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-217f655e-d5d0-453c-8a27-23887b4242e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-217f655e-d5d0-453c-8a27-23887b4242e4
Content-Type: application/json

--- request body ---
{"handle":"qa-34eda0393ce8","password":"****"}

--- response: 200 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-217f655e-d5d0-453c-8a27-23887b4242e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6bd4b7b8-6668-45f1-b469-8b163722c680"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f39825a9-0899-4581-9002-5c80031c52e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f39825a9-0899-4581-9002-5c80031c52e1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-87697445803a","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f39825a9-0899-4581-9002-5c80031c52e1
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
Location: /v1/conversations/cnv_3ed7a5a2-0c80-4f21-adb5-e3ecccea2a6c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3ed7a5a2-0c80-4f21-adb5-e3ecccea2a6c","subject":"Error contract","status":"open","region":"eu","participants":["qa-34eda0393ce8","qa-87697445803a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:32.224986454Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1a2436aa-7b07-4add-9e32-e37995716fe0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-dbe07a59aa944771afad460937f0a08b
X-Correlation-Id: qa-1a2436aa-7b07-4add-9e32-e37995716fe0
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a2436aa-7b07-4add-9e32-e37995716fe0
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-1a2436aa-7b07-4add-9e32-e37995716fe0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-176f501e-4c97-4435-90d5-f41ba6499e2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-176f501e-4c97-4435-90d5-f41ba6499e2c
Content-Type: application/json

--- request body ---
{"handle":"qa-87697445803a","password":"****"}

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-176f501e-4c97-4435-90d5-f41ba6499e2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_989f8134-567d-4ba5-b703-d3ad57600609"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-11612bef-9284-4012-90ab-226f41587844

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11612bef-9284-4012-90ab-226f41587844
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-11612bef-9284-4012-90ab-226f41587844
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
correlation: qa-58d3c663-faea-480b-97f5-7744e5059747

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58d3c663-faea-480b-97f5-7744e5059747
Content-Type: application/json

--- request body ---
{"handle":"qa-87697445803a","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58d3c663-faea-480b-97f5-7744e5059747
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-58d3c663-faea-480b-97f5-7744e5059747"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-78359a96-7533-4d81-8a4a-a267386a96c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78359a96-7533-4d81-8a4a-a267386a96c1
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-78359a96-7533-4d81-8a4a-a267386a96c1
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
correlation: qa-73bee5ea-69c5-480b-b7f6-cf49df89d06a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73bee5ea-69c5-480b-b7f6-cf49df89d06a
Content-Type: application/json

--- request body ---
{"handle":"qa-34eda0393ce8","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73bee5ea-69c5-480b-b7f6-cf49df89d06a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-73bee5ea-69c5-480b-b7f6-cf49df89d06a"}
```
