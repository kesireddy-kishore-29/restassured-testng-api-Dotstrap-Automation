# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[10]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-a10a8a7f-1874-4158-99f4-b36bd093c09a` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-7f092486-deba-4d46-8120-72c377bba7ba` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-0e7c890e-fcdb-4a75-8b2f-3fdc0cd01d98` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-bf6e08ec-d184-41a2-82f4-97a0ff47d3c0` |
| 5 | `POST /v1/conversations` | 415 | 13 | `qa-0d1265df-a687-4e29-a4d6-022c4817d15e` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-57ac1ff3-47c0-4bae-8212-b320fc13c224` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-1d825feb-a389-4df5-a941-8369e68c09af` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-e1e6a6c6-1ff5-48b2-ab77-ed23fa51b791` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-bcd46864-2a19-40ea-b1ad-0b6acf27312c` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-032d8708-080f-4721-ae91-c3bd9ba60ea1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a10a8a7f-1874-4158-99f4-b36bd093c09a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a10a8a7f-1874-4158-99f4-b36bd093c09a
Content-Type: application/json

--- request body ---
{"handle":"qa-18b2e25a723f","displayName":"QA 18b2e25a723f","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a10a8a7f-1874-4158-99f4-b36bd093c09a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 9
Location: /v1/accounts/qa-18b2e25a723f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5e9d9091-721e-44f7-84cf-d3c0c11a4af8","handle":"qa-18b2e25a723f","displayName":"QA 18b2e25a723f","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.745467918Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7f092486-deba-4d46-8120-72c377bba7ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f092486-deba-4d46-8120-72c377bba7ba
Content-Type: application/json

--- request body ---
{"handle":"qa-68b01639d81b","displayName":"QA 68b01639d81b","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f092486-deba-4d46-8120-72c377bba7ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 9
Location: /v1/accounts/qa-68b01639d81b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e4446a71-f062-4cb9-9d29-b4e2c1881ec4","handle":"qa-68b01639d81b","displayName":"QA 68b01639d81b","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.772954088Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0e7c890e-fcdb-4a75-8b2f-3fdc0cd01d98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e7c890e-fcdb-4a75-8b2f-3fdc0cd01d98
Content-Type: application/json

--- request body ---
{"handle":"qa-18b2e25a723f","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e7c890e-fcdb-4a75-8b2f-3fdc0cd01d98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5e9d9091-721e-44f7-84cf-d3c0c11a4af8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bf6e08ec-d184-41a2-82f4-97a0ff47d3c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf6e08ec-d184-41a2-82f4-97a0ff47d3c0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-68b01639d81b","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf6e08ec-d184-41a2-82f4-97a0ff47d3c0
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
Location: /v1/conversations/cnv_6d66d02e-390a-46de-8f5e-a139c7a8ac35
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6d66d02e-390a-46de-8f5e-a139c7a8ac35","subject":"Error contract","status":"open","region":"eu","participants":["qa-18b2e25a723f","qa-68b01639d81b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:02.829152635Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-0d1265df-a687-4e29-a4d6-022c4817d15e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d1265df-a687-4e29-a4d6-022c4817d15e
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d1265df-a687-4e29-a4d6-022c4817d15e
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-0d1265df-a687-4e29-a4d6-022c4817d15e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-57ac1ff3-47c0-4bae-8212-b320fc13c224

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57ac1ff3-47c0-4bae-8212-b320fc13c224
Content-Type: application/json

--- request body ---
{"handle":"qa-68b01639d81b","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-57ac1ff3-47c0-4bae-8212-b320fc13c224
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e4446a71-f062-4cb9-9d29-b4e2c1881ec4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1d825feb-a389-4df5-a941-8369e68c09af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d825feb-a389-4df5-a941-8369e68c09af
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1d825feb-a389-4df5-a941-8369e68c09af
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
correlation: qa-e1e6a6c6-1ff5-48b2-ab77-ed23fa51b791

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1e6a6c6-1ff5-48b2-ab77-ed23fa51b791
Content-Type: application/json

--- request body ---
{"handle":"qa-68b01639d81b","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1e6a6c6-1ff5-48b2-ab77-ed23fa51b791
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e1e6a6c6-1ff5-48b2-ab77-ed23fa51b791"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bcd46864-2a19-40ea-b1ad-0b6acf27312c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcd46864-2a19-40ea-b1ad-0b6acf27312c
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bcd46864-2a19-40ea-b1ad-0b6acf27312c
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
correlation: qa-032d8708-080f-4721-ae91-c3bd9ba60ea1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-032d8708-080f-4721-ae91-c3bd9ba60ea1
Content-Type: application/json

--- request body ---
{"handle":"qa-18b2e25a723f","password":"****"}

--- response: 401 in 27 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-032d8708-080f-4721-ae91-c3bd9ba60ea1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-032d8708-080f-4721-ae91-c3bd9ba60ea1"}
```
