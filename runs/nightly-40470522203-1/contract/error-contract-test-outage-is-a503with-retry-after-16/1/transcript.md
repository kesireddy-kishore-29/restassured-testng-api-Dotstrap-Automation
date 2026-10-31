# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-54f07e23-fbc3-4dab-b25e-b96f7aea380b` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-1e6198e7-a24c-4384-b689-5ddaa6472711` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-8714dc76-f24b-42ad-8724-032a67910931` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-12f86a50-6296-49e3-95e5-fb55a8bcc7aa` |
| 5 | `GET /v1/admin/stats` | 503 | 30 | `qa-c57c8f4a-fbd2-4eb7-a928-986b3d16e254` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-bdd52511-08e2-4a07-bbd0-da565d293efb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-2655fba4-0edf-483f-b4e3-0d347f101930` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-f664c237-eda6-4f36-9fca-0106f55bbb58` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-ff8e1798-709a-4184-9b0e-8526f7c624d1` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-c15c6f69-dfb6-4362-b68d-ddea99dc5f05` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-54f07e23-fbc3-4dab-b25e-b96f7aea380b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54f07e23-fbc3-4dab-b25e-b96f7aea380b
Content-Type: application/json

--- request body ---
{"handle":"qa-338f7983d201","displayName":"QA 338f7983d201","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-54f07e23-fbc3-4dab-b25e-b96f7aea380b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 6
Location: /v1/accounts/qa-338f7983d201
X-Served-Region: eu
Content-Length: 181

{"id":"acc_168ce553-7002-483a-b776-7723b4b06504","handle":"qa-338f7983d201","displayName":"QA 338f7983d201","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.689037501Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1e6198e7-a24c-4384-b689-5ddaa6472711

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e6198e7-a24c-4384-b689-5ddaa6472711
Content-Type: application/json

--- request body ---
{"handle":"qa-df0bc6274a75","displayName":"QA df0bc6274a75","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e6198e7-a24c-4384-b689-5ddaa6472711
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 6
Location: /v1/accounts/qa-df0bc6274a75
X-Served-Region: eu
Content-Length: 181

{"id":"acc_262fc137-27fe-4746-b0a1-9b0dbbbf9b50","handle":"qa-df0bc6274a75","displayName":"QA df0bc6274a75","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.734861902Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8714dc76-f24b-42ad-8724-032a67910931

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8714dc76-f24b-42ad-8724-032a67910931
Content-Type: application/json

--- request body ---
{"handle":"qa-338f7983d201","password":"****"}

--- response: 200 in 37 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-8714dc76-f24b-42ad-8724-032a67910931
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_168ce553-7002-483a-b776-7723b4b06504"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-12f86a50-6296-49e3-95e5-fb55a8bcc7aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12f86a50-6296-49e3-95e5-fb55a8bcc7aa
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-df0bc6274a75","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-12f86a50-6296-49e3-95e5-fb55a8bcc7aa
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
Location: /v1/conversations/cnv_6b9b9e87-dfb5-47c1-bdd8-5621a736d707
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6b9b9e87-dfb5-47c1-bdd8-5621a736d707","subject":"Error contract","status":"open","region":"eu","participants":["qa-338f7983d201","qa-df0bc6274a75"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:35.814358213Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-c57c8f4a-fbd2-4eb7-a928-986b3d16e254

--- request headers ---
Accept: application/json
X-Fault-Key: 92052473-73bc-47df-b58d-234472fc1b63
X-Fault: unavailable-once
X-Correlation-Id: qa-c57c8f4a-fbd2-4eb7-a928-986b3d16e254
Content-Type: application/json

--- response: 503 in 30 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c57c8f4a-fbd2-4eb7-a928-986b3d16e254
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-c57c8f4a-fbd2-4eb7-a928-986b3d16e254"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bdd52511-08e2-4a07-bbd0-da565d293efb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdd52511-08e2-4a07-bbd0-da565d293efb
Content-Type: application/json

--- request body ---
{"handle":"qa-df0bc6274a75","password":"****"}

--- response: 200 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdd52511-08e2-4a07-bbd0-da565d293efb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_262fc137-27fe-4746-b0a1-9b0dbbbf9b50"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2655fba4-0edf-483f-b4e3-0d347f101930

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2655fba4-0edf-483f-b4e3-0d347f101930
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2655fba4-0edf-483f-b4e3-0d347f101930
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
correlation: qa-f664c237-eda6-4f36-9fca-0106f55bbb58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f664c237-eda6-4f36-9fca-0106f55bbb58
Content-Type: application/json

--- request body ---
{"handle":"qa-df0bc6274a75","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f664c237-eda6-4f36-9fca-0106f55bbb58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f664c237-eda6-4f36-9fca-0106f55bbb58"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ff8e1798-709a-4184-9b0e-8526f7c624d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff8e1798-709a-4184-9b0e-8526f7c624d1
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ff8e1798-709a-4184-9b0e-8526f7c624d1
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
correlation: qa-c15c6f69-dfb6-4362-b68d-ddea99dc5f05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c15c6f69-dfb6-4362-b68d-ddea99dc5f05
Content-Type: application/json

--- request body ---
{"handle":"qa-338f7983d201","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c15c6f69-dfb6-4362-b68d-ddea99dc5f05
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c15c6f69-dfb6-4362-b68d-ddea99dc5f05"}
```
