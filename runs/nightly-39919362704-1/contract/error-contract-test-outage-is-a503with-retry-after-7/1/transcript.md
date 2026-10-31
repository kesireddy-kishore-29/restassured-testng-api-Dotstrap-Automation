# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-9a25a311-c672-4207-9259-cddd3f385885` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-82a413a4-a125-4596-9998-b9f92bb6dea4` |
| 3 | `POST /v1/auth/token` | 200 | 59 | `qa-eeb6a27f-c12f-404e-9331-fa58bfb9602f` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-9d228015-57c4-4f85-b5f5-569399e8eeff` |
| 5 | `GET /v1/conversations` | 503 | 19 | `qa-e431bfb8-2166-4cc6-aaad-80208b20adf6` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-ac15aa5b-a1d6-4b7e-b101-a687fe8b471a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-12595281-88de-40c2-966a-e3a4bc0f5e3b` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-b4496fe7-62bf-4747-9002-0c6df5282b7e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-5aec1433-62e0-4211-8ab3-066514663d1d` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-f6e3b5aa-c45d-48b2-87f4-4fb76675429e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9a25a311-c672-4207-9259-cddd3f385885

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a25a311-c672-4207-9259-cddd3f385885
Content-Type: application/json

--- request body ---
{"handle":"qa-8fe403d41dab","displayName":"QA 8fe403d41dab","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a25a311-c672-4207-9259-cddd3f385885
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Location: /v1/accounts/qa-8fe403d41dab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c27adb3e-edb8-47b4-ae8c-10810f6d08ab","handle":"qa-8fe403d41dab","displayName":"QA 8fe403d41dab","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.471456600Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-82a413a4-a125-4596-9998-b9f92bb6dea4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82a413a4-a125-4596-9998-b9f92bb6dea4
Content-Type: application/json

--- request body ---
{"handle":"qa-576c7cb86b17","displayName":"QA 576c7cb86b17","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-82a413a4-a125-4596-9998-b9f92bb6dea4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 7
Location: /v1/accounts/qa-576c7cb86b17
X-Served-Region: eu
Content-Length: 181

{"id":"acc_503fc76b-bbbb-4fed-af6c-a98ff4020839","handle":"qa-576c7cb86b17","displayName":"QA 576c7cb86b17","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.553703747Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-eeb6a27f-c12f-404e-9331-fa58bfb9602f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eeb6a27f-c12f-404e-9331-fa58bfb9602f
Content-Type: application/json

--- request body ---
{"handle":"qa-8fe403d41dab","password":"****"}

--- response: 200 in 59 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-eeb6a27f-c12f-404e-9331-fa58bfb9602f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c27adb3e-edb8-47b4-ae8c-10810f6d08ab"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9d228015-57c4-4f85-b5f5-569399e8eeff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d228015-57c4-4f85-b5f5-569399e8eeff
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-576c7cb86b17","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d228015-57c4-4f85-b5f5-569399e8eeff
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
Location: /v1/conversations/cnv_052f9106-0043-4f5b-9570-8ffb190a5545
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_052f9106-0043-4f5b-9570-8ffb190a5545","subject":"Error contract","status":"open","region":"eu","participants":["qa-8fe403d41dab","qa-576c7cb86b17"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:45.660387060Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-e431bfb8-2166-4cc6-aaad-80208b20adf6

--- request headers ---
Accept: application/json
X-Fault-Key: 5bdc163c-c7d7-4095-b3b7-1183c0887cf7
X-Fault: unavailable-once
X-Correlation-Id: qa-e431bfb8-2166-4cc6-aaad-80208b20adf6
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e431bfb8-2166-4cc6-aaad-80208b20adf6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-e431bfb8-2166-4cc6-aaad-80208b20adf6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ac15aa5b-a1d6-4b7e-b101-a687fe8b471a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac15aa5b-a1d6-4b7e-b101-a687fe8b471a
Content-Type: application/json

--- request body ---
{"handle":"qa-576c7cb86b17","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac15aa5b-a1d6-4b7e-b101-a687fe8b471a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_503fc76b-bbbb-4fed-af6c-a98ff4020839"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-12595281-88de-40c2-966a-e3a4bc0f5e3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12595281-88de-40c2-966a-e3a4bc0f5e3b
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-12595281-88de-40c2-966a-e3a4bc0f5e3b
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
correlation: qa-b4496fe7-62bf-4747-9002-0c6df5282b7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4496fe7-62bf-4747-9002-0c6df5282b7e
Content-Type: application/json

--- request body ---
{"handle":"qa-576c7cb86b17","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4496fe7-62bf-4747-9002-0c6df5282b7e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b4496fe7-62bf-4747-9002-0c6df5282b7e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5aec1433-62e0-4211-8ab3-066514663d1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5aec1433-62e0-4211-8ab3-066514663d1d
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5aec1433-62e0-4211-8ab3-066514663d1d
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
correlation: qa-f6e3b5aa-c45d-48b2-87f4-4fb76675429e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6e3b5aa-c45d-48b2-87f4-4fb76675429e
Content-Type: application/json

--- request body ---
{"handle":"qa-8fe403d41dab","password":"****"}

--- response: 401 in 28 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6e3b5aa-c45d-48b2-87f4-4fb76675429e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f6e3b5aa-c45d-48b2-87f4-4fb76675429e"}
```
