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
| 1 | `POST /v1/accounts` | 201 | 56 | `qa-382e12af-d03a-45e4-a5c0-35a1f2472eb5` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-93872e22-347b-4ec2-928b-37a2c681280d` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-46842b10-16b4-45da-a529-d0411e127a55` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-3d841f84-c37c-4f53-b638-221e0b9b9df1` |
| 5 | `POST /v1/accounts` | 415 | 39 | `qa-6a153446-fd0f-477f-9093-f14a43ec3f81` |
| 6 | `POST /v1/auth/token` | 200 | 45 | `qa-d14db29e-bd93-40a6-996d-0ee7d71c2ff6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-199232eb-750d-4eb6-a13c-664087d98c80` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-8fe06d44-a5a2-41d3-940d-780259f9df8c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-cffef7b4-3ac1-4acb-b94c-93b536395ff4` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-f16e61b0-01d4-481a-b799-966ee0a5ebcf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-382e12af-d03a-45e4-a5c0-35a1f2472eb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-382e12af-d03a-45e4-a5c0-35a1f2472eb5
Content-Type: application/json

--- request body ---
{"handle":"qa-7c8ad8e78039","displayName":"QA 7c8ad8e78039","password":"****","region":"eu"}

--- response: 201 in 56 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-382e12af-d03a-45e4-a5c0-35a1f2472eb5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 7
Location: /v1/accounts/qa-7c8ad8e78039
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c0fff545-f01e-4549-9db4-ecf136b7d9db","handle":"qa-7c8ad8e78039","displayName":"QA 7c8ad8e78039","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.342631391Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-93872e22-347b-4ec2-928b-37a2c681280d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93872e22-347b-4ec2-928b-37a2c681280d
Content-Type: application/json

--- request body ---
{"handle":"qa-93228d723877","displayName":"QA 93228d723877","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-93872e22-347b-4ec2-928b-37a2c681280d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 7
Location: /v1/accounts/qa-93228d723877
X-Served-Region: eu
Content-Length: 181

{"id":"acc_18ee1047-f256-484c-b514-e27094123034","handle":"qa-93228d723877","displayName":"QA 93228d723877","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.419778992Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-46842b10-16b4-45da-a529-d0411e127a55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46842b10-16b4-45da-a529-d0411e127a55
Content-Type: application/json

--- request body ---
{"handle":"qa-7c8ad8e78039","password":"****"}

--- response: 200 in 32 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-46842b10-16b4-45da-a529-d0411e127a55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c0fff545-f01e-4549-9db4-ecf136b7d9db"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3d841f84-c37c-4f53-b638-221e0b9b9df1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d841f84-c37c-4f53-b638-221e0b9b9df1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-93228d723877","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d841f84-c37c-4f53-b638-221e0b9b9df1
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
Location: /v1/conversations/cnv_db74d078-f537-4dfe-a3b2-6b0f0280fad2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_db74d078-f537-4dfe-a3b2-6b0f0280fad2","subject":"Error contract","status":"open","region":"eu","participants":["qa-7c8ad8e78039","qa-93228d723877"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:25.501754406Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-6a153446-fd0f-477f-9093-f14a43ec3f81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a153446-fd0f-477f-9093-f14a43ec3f81
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 39 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a153446-fd0f-477f-9093-f14a43ec3f81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 7
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-6a153446-fd0f-477f-9093-f14a43ec3f81"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d14db29e-bd93-40a6-996d-0ee7d71c2ff6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d14db29e-bd93-40a6-996d-0ee7d71c2ff6
Content-Type: application/json

--- request body ---
{"handle":"qa-93228d723877","password":"****"}

--- response: 200 in 45 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-d14db29e-bd93-40a6-996d-0ee7d71c2ff6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18ee1047-f256-484c-b514-e27094123034"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-199232eb-750d-4eb6-a13c-664087d98c80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-199232eb-750d-4eb6-a13c-664087d98c80
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-199232eb-750d-4eb6-a13c-664087d98c80
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
correlation: qa-8fe06d44-a5a2-41d3-940d-780259f9df8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fe06d44-a5a2-41d3-940d-780259f9df8c
Content-Type: application/json

--- request body ---
{"handle":"qa-93228d723877","password":"****"}

--- response: 401 in 25 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8fe06d44-a5a2-41d3-940d-780259f9df8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8fe06d44-a5a2-41d3-940d-780259f9df8c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cffef7b4-3ac1-4acb-b94c-93b536395ff4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cffef7b4-3ac1-4acb-b94c-93b536395ff4
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cffef7b4-3ac1-4acb-b94c-93b536395ff4
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
correlation: qa-f16e61b0-01d4-481a-b799-966ee0a5ebcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f16e61b0-01d4-481a-b799-966ee0a5ebcf
Content-Type: application/json

--- request body ---
{"handle":"qa-7c8ad8e78039","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f16e61b0-01d4-481a-b799-966ee0a5ebcf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f16e61b0-01d4-481a-b799-966ee0a5ebcf"}
```
