# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 454 | `qa-5f38445e-4555-4bc9-a758-92f1810e69cb` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-0382fb69-9201-4516-af9f-e559c9207ae7` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-2b507920-b8dd-4e62-8dbc-17f63e1aeb1b` |
| 4 | `POST /v1/conversations` | 201 | 46 | `qa-f46688df-b3fc-442f-9002-9801472bd7a6` |
| 5 | `GET /v1/accounts/me` | 503 | 28 | `qa-c056eaed-ea0f-4c5d-aff8-0d51d3acc60e` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-af968124-29d3-40d2-9420-79886c850e24` |
| 7 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-8ff989e5-62c0-47ef-9e9d-cfb635272f4c` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-653eb52f-66af-4a28-829d-2a060cff978e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-f060a40a-21f0-493a-b621-dec2e7eaa76c` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-da1b3b61-397c-44b1-ae53-afff678abdd8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5f38445e-4555-4bc9-a758-92f1810e69cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f38445e-4555-4bc9-a758-92f1810e69cb
Content-Type: application/json

--- request body ---
{"handle":"qa-97b7034de86f","displayName":"QA 97b7034de86f","password":"****","region":"eu"}

--- response: 201 in 454 ms ---
Date: Wed, 04 Nov 2026 09:28:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f38445e-4555-4bc9-a758-92f1810e69cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-97b7034de86f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b2471d9a-dcc9-473d-a2f4-acf42315f543","handle":"qa-97b7034de86f","displayName":"QA 97b7034de86f","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.099757735Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0382fb69-9201-4516-af9f-e559c9207ae7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0382fb69-9201-4516-af9f-e559c9207ae7
Content-Type: application/json

--- request body ---
{"handle":"qa-04999c6be69c","displayName":"QA 04999c6be69c","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-0382fb69-9201-4516-af9f-e559c9207ae7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Location: /v1/accounts/qa-04999c6be69c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9b7204b0-2122-4506-be60-60a50c49aed0","handle":"qa-04999c6be69c","displayName":"QA 04999c6be69c","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.366423806Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2b507920-b8dd-4e62-8dbc-17f63e1aeb1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b507920-b8dd-4e62-8dbc-17f63e1aeb1b
Content-Type: application/json

--- request body ---
{"handle":"qa-97b7034de86f","password":"****"}

--- response: 200 in 32 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b507920-b8dd-4e62-8dbc-17f63e1aeb1b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b2471d9a-dcc9-473d-a2f4-acf42315f543"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f46688df-b3fc-442f-9002-9801472bd7a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f46688df-b3fc-442f-9002-9801472bd7a6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-04999c6be69c","subject":"Error contract","message":"Hi"}

--- response: 201 in 46 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f46688df-b3fc-442f-9002-9801472bd7a6
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
Location: /v1/conversations/cnv_f0d60d05-514b-4b4f-9f28-626fefcff7f0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f0d60d05-514b-4b4f-9f28-626fefcff7f0","subject":"Error contract","status":"open","region":"eu","participants":["qa-97b7034de86f","qa-04999c6be69c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:01.526738360Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-c056eaed-ea0f-4c5d-aff8-0d51d3acc60e

--- request headers ---
Accept: application/json
X-Fault-Key: 35ab70e8-5617-422d-96ea-d7199ddbda46
X-Fault: unavailable-once
X-Correlation-Id: qa-c056eaed-ea0f-4c5d-aff8-0d51d3acc60e
Content-Type: application/json

--- response: 503 in 28 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c056eaed-ea0f-4c5d-aff8-0d51d3acc60e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-c056eaed-ea0f-4c5d-aff8-0d51d3acc60e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-af968124-29d3-40d2-9420-79886c850e24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af968124-29d3-40d2-9420-79886c850e24
Content-Type: application/json

--- request body ---
{"handle":"qa-04999c6be69c","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-af968124-29d3-40d2-9420-79886c850e24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b7204b0-2122-4506-be60-60a50c49aed0"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8ff989e5-62c0-47ef-9e9d-cfb635272f4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ff989e5-62c0-47ef-9e9d-cfb635272f4c
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8ff989e5-62c0-47ef-9e9d-cfb635272f4c
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
correlation: qa-653eb52f-66af-4a28-829d-2a060cff978e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-653eb52f-66af-4a28-829d-2a060cff978e
Content-Type: application/json

--- request body ---
{"handle":"qa-04999c6be69c","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-653eb52f-66af-4a28-829d-2a060cff978e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-653eb52f-66af-4a28-829d-2a060cff978e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f060a40a-21f0-493a-b621-dec2e7eaa76c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f060a40a-21f0-493a-b621-dec2e7eaa76c
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f060a40a-21f0-493a-b621-dec2e7eaa76c
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
correlation: qa-da1b3b61-397c-44b1-ae53-afff678abdd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da1b3b61-397c-44b1-ae53-afff678abdd8
Content-Type: application/json

--- request body ---
{"handle":"qa-97b7034de86f","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da1b3b61-397c-44b1-ae53-afff678abdd8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-da1b3b61-397c-44b1-ae53-afff678abdd8"}
```
