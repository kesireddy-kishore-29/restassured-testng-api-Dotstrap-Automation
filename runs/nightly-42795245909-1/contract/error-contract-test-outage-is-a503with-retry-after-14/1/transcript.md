# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-486eaeca-ea55-49e2-a24c-8da05af29633` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-71bf3eb0-95b2-42cd-b0bf-57ff937ef58f` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-b143e2c6-05fc-471d-9269-3c8761a75b0e` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-40e8f0ea-e855-4c1f-a78c-8e5f339b3c17` |
| 5 | `GET /v1/credits/ledger` | 503 | 39 | `qa-8c3280da-b94e-4693-a816-73253f4abbfc` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-8c93b731-4368-4e11-8181-dee26e6dd12c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-70d2e045-08ff-4270-8fa0-cf01ea210afe` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-9d340d9b-8318-47a4-8ed5-8522f239db7d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-dbd46ecb-3e05-4b7c-afa3-50c6988d90a1` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-05d49538-7fba-47b9-bfba-aff6d69bd375` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-486eaeca-ea55-49e2-a24c-8da05af29633

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-486eaeca-ea55-49e2-a24c-8da05af29633
Content-Type: application/json

--- request body ---
{"handle":"qa-23ad3854a8eb","displayName":"QA 23ad3854a8eb","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-486eaeca-ea55-49e2-a24c-8da05af29633
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 7
Location: /v1/accounts/qa-23ad3854a8eb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_af1627ea-4496-4aee-84ef-0dedc85fd4b8","handle":"qa-23ad3854a8eb","displayName":"QA 23ad3854a8eb","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.347993030Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-71bf3eb0-95b2-42cd-b0bf-57ff937ef58f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71bf3eb0-95b2-42cd-b0bf-57ff937ef58f
Content-Type: application/json

--- request body ---
{"handle":"qa-9edf86d727a4","displayName":"QA 9edf86d727a4","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-71bf3eb0-95b2-42cd-b0bf-57ff937ef58f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 7
Location: /v1/accounts/qa-9edf86d727a4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_87d13534-7f72-4825-a49c-7d5d165df410","handle":"qa-9edf86d727a4","displayName":"QA 9edf86d727a4","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.385558563Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b143e2c6-05fc-471d-9269-3c8761a75b0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b143e2c6-05fc-471d-9269-3c8761a75b0e
Content-Type: application/json

--- request body ---
{"handle":"qa-23ad3854a8eb","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-b143e2c6-05fc-471d-9269-3c8761a75b0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_af1627ea-4496-4aee-84ef-0dedc85fd4b8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-40e8f0ea-e855-4c1f-a78c-8e5f339b3c17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40e8f0ea-e855-4c1f-a78c-8e5f339b3c17
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9edf86d727a4","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-40e8f0ea-e855-4c1f-a78c-8e5f339b3c17
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
Location: /v1/conversations/cnv_4701b4f7-ca0f-4efb-a9ed-66584ac97776
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4701b4f7-ca0f-4efb-a9ed-66584ac97776","subject":"Error contract","status":"open","region":"eu","participants":["qa-23ad3854a8eb","qa-9edf86d727a4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:37.473201494Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-8c3280da-b94e-4693-a816-73253f4abbfc

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c4ffcb80-cec5-4a49-bdc5-66c7b47347f9
X-Correlation-Id: qa-8c3280da-b94e-4693-a816-73253f4abbfc
Content-Type: application/json

--- response: 503 in 39 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c3280da-b94e-4693-a816-73253f4abbfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-8c3280da-b94e-4693-a816-73253f4abbfc"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8c93b731-4368-4e11-8181-dee26e6dd12c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c93b731-4368-4e11-8181-dee26e6dd12c
Content-Type: application/json

--- request body ---
{"handle":"qa-9edf86d727a4","password":"****"}

--- response: 200 in 25 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c93b731-4368-4e11-8181-dee26e6dd12c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_87d13534-7f72-4825-a49c-7d5d165df410"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70d2e045-08ff-4270-8fa0-cf01ea210afe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70d2e045-08ff-4270-8fa0-cf01ea210afe
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70d2e045-08ff-4270-8fa0-cf01ea210afe
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
correlation: qa-9d340d9b-8318-47a4-8ed5-8522f239db7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d340d9b-8318-47a4-8ed5-8522f239db7d
Content-Type: application/json

--- request body ---
{"handle":"qa-9edf86d727a4","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d340d9b-8318-47a4-8ed5-8522f239db7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9d340d9b-8318-47a4-8ed5-8522f239db7d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dbd46ecb-3e05-4b7c-afa3-50c6988d90a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbd46ecb-3e05-4b7c-afa3-50c6988d90a1
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dbd46ecb-3e05-4b7c-afa3-50c6988d90a1
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
correlation: qa-05d49538-7fba-47b9-bfba-aff6d69bd375

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05d49538-7fba-47b9-bfba-aff6d69bd375
Content-Type: application/json

--- request body ---
{"handle":"qa-23ad3854a8eb","password":"****"}

--- response: 401 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05d49538-7fba-47b9-bfba-aff6d69bd375
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-05d49538-7fba-47b9-bfba-aff6d69bd375"}
```
