# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-576dc1d3-f7da-45a9-9ad2-c1e060763270` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-dc76138e-988a-4f91-89e5-00570b6f06bc` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-afe40001-3cfc-4087-8b82-c5237753a506` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-55cf7d4b-8c98-436b-a610-20ea2b2d5202` |
| 5 | `PATCH /v1/accounts/me` | 503 | 10 | `qa-cd2e09a7-7981-4666-96d8-4fc5e47b82f2` |
| 6 | `POST /v1/auth/token` | 200 | 54 | `qa-21d80476-6c46-4a44-9eb2-7aa4addcb74f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-154beea3-dc5f-4ba9-89c1-7ad53bd5de25` |
| 8 | `POST /v1/auth/token` | 401 | 31 | `qa-1f22a9fe-7b67-4430-b70a-511548d764e4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-5820bd36-2d62-4892-bca6-7f8a24c546f2` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-3af7a776-7751-4a1f-86dd-b661ad0d1bb2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-576dc1d3-f7da-45a9-9ad2-c1e060763270

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-576dc1d3-f7da-45a9-9ad2-c1e060763270
Content-Type: application/json

--- request body ---
{"handle":"qa-fad8f4fc7261","displayName":"QA fad8f4fc7261","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-576dc1d3-f7da-45a9-9ad2-c1e060763270
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
Location: /v1/accounts/qa-fad8f4fc7261
X-Served-Region: eu
Content-Length: 181

{"id":"acc_99368ada-b0ad-4e04-a226-31fccf97de3c","handle":"qa-fad8f4fc7261","displayName":"QA fad8f4fc7261","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.133272562Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dc76138e-988a-4f91-89e5-00570b6f06bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc76138e-988a-4f91-89e5-00570b6f06bc
Content-Type: application/json

--- request body ---
{"handle":"qa-87b898060f63","displayName":"QA 87b898060f63","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc76138e-988a-4f91-89e5-00570b6f06bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Location: /v1/accounts/qa-87b898060f63
X-Served-Region: eu
Content-Length: 181

{"id":"acc_27ede26e-d963-4cbb-b302-3eb297be9bd2","handle":"qa-87b898060f63","displayName":"QA 87b898060f63","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.200094712Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-afe40001-3cfc-4087-8b82-c5237753a506

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afe40001-3cfc-4087-8b82-c5237753a506
Content-Type: application/json

--- request body ---
{"handle":"qa-fad8f4fc7261","password":"****"}

--- response: 200 in 37 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-afe40001-3cfc-4087-8b82-c5237753a506
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_99368ada-b0ad-4e04-a226-31fccf97de3c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-55cf7d4b-8c98-436b-a610-20ea2b2d5202

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55cf7d4b-8c98-436b-a610-20ea2b2d5202
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-87b898060f63","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-55cf7d4b-8c98-436b-a610-20ea2b2d5202
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
Location: /v1/conversations/cnv_429ea8f8-a995-4e9f-8559-becc007a4a88
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_429ea8f8-a995-4e9f-8559-becc007a4a88","subject":"Error contract","status":"open","region":"eu","participants":["qa-fad8f4fc7261","qa-87b898060f63"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:57.271859128Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-cd2e09a7-7981-4666-96d8-4fc5e47b82f2

--- request headers ---
Accept: application/json
X-Fault-Key: 01f1029d-6151-4de0-86f0-05def126c50d
X-Fault: unavailable-once
X-Correlation-Id: qa-cd2e09a7-7981-4666-96d8-4fc5e47b82f2
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd2e09a7-7981-4666-96d8-4fc5e47b82f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-cd2e09a7-7981-4666-96d8-4fc5e47b82f2"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-21d80476-6c46-4a44-9eb2-7aa4addcb74f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21d80476-6c46-4a44-9eb2-7aa4addcb74f
Content-Type: application/json

--- request body ---
{"handle":"qa-87b898060f63","password":"****"}

--- response: 200 in 54 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-21d80476-6c46-4a44-9eb2-7aa4addcb74f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_27ede26e-d963-4cbb-b302-3eb297be9bd2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-154beea3-dc5f-4ba9-89c1-7ad53bd5de25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-154beea3-dc5f-4ba9-89c1-7ad53bd5de25
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-154beea3-dc5f-4ba9-89c1-7ad53bd5de25
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
correlation: qa-1f22a9fe-7b67-4430-b70a-511548d764e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f22a9fe-7b67-4430-b70a-511548d764e4
Content-Type: application/json

--- request body ---
{"handle":"qa-87b898060f63","password":"****"}

--- response: 401 in 31 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f22a9fe-7b67-4430-b70a-511548d764e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1f22a9fe-7b67-4430-b70a-511548d764e4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5820bd36-2d62-4892-bca6-7f8a24c546f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5820bd36-2d62-4892-bca6-7f8a24c546f2
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5820bd36-2d62-4892-bca6-7f8a24c546f2
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
correlation: qa-3af7a776-7751-4a1f-86dd-b661ad0d1bb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3af7a776-7751-4a1f-86dd-b661ad0d1bb2
Content-Type: application/json

--- request body ---
{"handle":"qa-fad8f4fc7261","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3af7a776-7751-4a1f-86dd-b661ad0d1bb2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3af7a776-7751-4a1f-86dd-b661ad0d1bb2"}
```
