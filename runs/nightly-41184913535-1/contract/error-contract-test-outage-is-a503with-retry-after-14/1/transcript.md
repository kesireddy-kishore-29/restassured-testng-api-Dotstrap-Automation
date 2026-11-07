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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-342b1e55-a6e0-4cc7-8ba1-8e443e6f0d8c` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-be8577f9-4ec8-4530-8f54-45d2a0b84007` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-31563281-94b8-47bd-a7a1-4fcf97c11364` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-2e894583-90e5-490c-90f4-942568463609` |
| 5 | `GET /v1/credits/ledger` | 503 | 23 | `qa-46504ea6-096a-4426-acac-7a3ab7668fa9` |
| 6 | `POST /v1/auth/token` | 200 | 44 | `qa-28d89a39-f9a9-48e7-ba6f-715ef4c32c0e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-761270e5-b7ad-4363-8da4-8770de1e5bd3` |
| 8 | `POST /v1/auth/token` | 401 | 35 | `qa-cbfcfcdf-5125-4490-8bee-c841cb4b3594` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-ae05c506-91e4-4e19-992d-ceb7182480cf` |
| 10 | `POST /v1/auth/token` | 401 | 61 | `qa-8495ce4c-adc4-4349-991c-2143f75fb18d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-342b1e55-a6e0-4cc7-8ba1-8e443e6f0d8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-342b1e55-a6e0-4cc7-8ba1-8e443e6f0d8c
Content-Type: application/json

--- request body ---
{"handle":"qa-9787f2c6383d","displayName":"QA 9787f2c6383d","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-342b1e55-a6e0-4cc7-8ba1-8e443e6f0d8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 7
Location: /v1/accounts/qa-9787f2c6383d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e7860ca0-dd79-4cb8-9bd6-300a7714adfc","handle":"qa-9787f2c6383d","displayName":"QA 9787f2c6383d","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.276268828Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-be8577f9-4ec8-4530-8f54-45d2a0b84007

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be8577f9-4ec8-4530-8f54-45d2a0b84007
Content-Type: application/json

--- request body ---
{"handle":"qa-7c1d6ed7206a","displayName":"QA 7c1d6ed7206a","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-be8577f9-4ec8-4530-8f54-45d2a0b84007
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 7
Location: /v1/accounts/qa-7c1d6ed7206a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba1aa553-a2f4-46f9-9297-144becbebca5","handle":"qa-7c1d6ed7206a","displayName":"QA 7c1d6ed7206a","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.321218454Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-31563281-94b8-47bd-a7a1-4fcf97c11364

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31563281-94b8-47bd-a7a1-4fcf97c11364
Content-Type: application/json

--- request body ---
{"handle":"qa-9787f2c6383d","password":"****"}

--- response: 200 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-31563281-94b8-47bd-a7a1-4fcf97c11364
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e7860ca0-dd79-4cb8-9bd6-300a7714adfc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2e894583-90e5-490c-90f4-942568463609

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e894583-90e5-490c-90f4-942568463609
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7c1d6ed7206a","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e894583-90e5-490c-90f4-942568463609
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
Location: /v1/conversations/cnv_9d8623e3-8a2c-4926-a611-233625e88b1d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9d8623e3-8a2c-4926-a611-233625e88b1d","subject":"Error contract","status":"open","region":"eu","participants":["qa-9787f2c6383d","qa-7c1d6ed7206a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:36.403356207Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-46504ea6-096a-4426-acac-7a3ab7668fa9

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 2c214a22-30c6-4baf-97e2-c4d58c085d49
X-Correlation-Id: qa-46504ea6-096a-4426-acac-7a3ab7668fa9
Content-Type: application/json

--- response: 503 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46504ea6-096a-4426-acac-7a3ab7668fa9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-46504ea6-096a-4426-acac-7a3ab7668fa9"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-28d89a39-f9a9-48e7-ba6f-715ef4c32c0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28d89a39-f9a9-48e7-ba6f-715ef4c32c0e
Content-Type: application/json

--- request body ---
{"handle":"qa-7c1d6ed7206a","password":"****"}

--- response: 200 in 44 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-28d89a39-f9a9-48e7-ba6f-715ef4c32c0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ba1aa553-a2f4-46f9-9297-144becbebca5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-761270e5-b7ad-4363-8da4-8770de1e5bd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-761270e5-b7ad-4363-8da4-8770de1e5bd3
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-761270e5-b7ad-4363-8da4-8770de1e5bd3
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
correlation: qa-cbfcfcdf-5125-4490-8bee-c841cb4b3594

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbfcfcdf-5125-4490-8bee-c841cb4b3594
Content-Type: application/json

--- request body ---
{"handle":"qa-7c1d6ed7206a","password":"****"}

--- response: 401 in 35 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cbfcfcdf-5125-4490-8bee-c841cb4b3594
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cbfcfcdf-5125-4490-8bee-c841cb4b3594"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ae05c506-91e4-4e19-992d-ceb7182480cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae05c506-91e4-4e19-992d-ceb7182480cf
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ae05c506-91e4-4e19-992d-ceb7182480cf
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
correlation: qa-8495ce4c-adc4-4349-991c-2143f75fb18d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8495ce4c-adc4-4349-991c-2143f75fb18d
Content-Type: application/json

--- request body ---
{"handle":"qa-9787f2c6383d","password":"****"}

--- response: 401 in 61 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8495ce4c-adc4-4349-991c-2143f75fb18d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8495ce4c-adc4-4349-991c-2143f75fb18d"}
```
