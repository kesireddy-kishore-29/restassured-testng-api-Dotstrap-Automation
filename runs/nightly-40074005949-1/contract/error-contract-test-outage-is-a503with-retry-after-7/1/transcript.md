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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-7e7430bc-f153-4ac9-a0ec-5245141665de` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-101f4a3c-9f00-4907-a2e8-f6ef29b3f72a` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-12c2f87b-ba06-4419-9dcd-288a9c1197e7` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-4335ed49-e7a9-4802-a941-c95a061d721a` |
| 5 | `GET /v1/conversations` | 503 | 15 | `qa-dddb76f9-a151-4201-a443-15ac927613a1` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-780d27d4-fdb7-4cdd-9276-702cf1aa85a2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-24c70a9a-833c-42da-b545-4feed7ea0d77` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-7cd11638-fab4-430d-8231-bd729afa6be7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-18143e73-94cd-415f-8d54-c7db9bebe730` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-f41901dc-46aa-417d-86f5-db9e6823c8dd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7e7430bc-f153-4ac9-a0ec-5245141665de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e7430bc-f153-4ac9-a0ec-5245141665de
Content-Type: application/json

--- request body ---
{"handle":"qa-cff05e07b675","displayName":"QA cff05e07b675","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e7430bc-f153-4ac9-a0ec-5245141665de
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
Location: /v1/accounts/qa-cff05e07b675
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fb939d87-4ee0-44f9-93b1-8a6aa26cff9a","handle":"qa-cff05e07b675","displayName":"QA cff05e07b675","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.954177193Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-101f4a3c-9f00-4907-a2e8-f6ef29b3f72a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-101f4a3c-9f00-4907-a2e8-f6ef29b3f72a
Content-Type: application/json

--- request body ---
{"handle":"qa-4a5a99546ccd","displayName":"QA 4a5a99546ccd","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-101f4a3c-9f00-4907-a2e8-f6ef29b3f72a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Location: /v1/accounts/qa-4a5a99546ccd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_26e7a8e0-449d-4de0-b4b5-63bca5c5adb0","handle":"qa-4a5a99546ccd","displayName":"QA 4a5a99546ccd","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.993254419Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-12c2f87b-ba06-4419-9dcd-288a9c1197e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12c2f87b-ba06-4419-9dcd-288a9c1197e7
Content-Type: application/json

--- request body ---
{"handle":"qa-cff05e07b675","password":"****"}

--- response: 200 in 36 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-12c2f87b-ba06-4419-9dcd-288a9c1197e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fb939d87-4ee0-44f9-93b1-8a6aa26cff9a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4335ed49-e7a9-4802-a941-c95a061d721a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4335ed49-e7a9-4802-a941-c95a061d721a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4a5a99546ccd","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4335ed49-e7a9-4802-a941-c95a061d721a
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
Location: /v1/conversations/cnv_82fa043c-f346-444e-a914-7857863a914a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_82fa043c-f346-444e-a914-7857863a914a","subject":"Error contract","status":"open","region":"eu","participants":["qa-cff05e07b675","qa-4a5a99546ccd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.077720543Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-dddb76f9-a151-4201-a443-15ac927613a1

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 0843f0cb-8f70-425d-8908-7159484aeb59
X-Correlation-Id: qa-dddb76f9-a151-4201-a443-15ac927613a1
Content-Type: application/json

--- response: 503 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dddb76f9-a151-4201-a443-15ac927613a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-dddb76f9-a151-4201-a443-15ac927613a1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-780d27d4-fdb7-4cdd-9276-702cf1aa85a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-780d27d4-fdb7-4cdd-9276-702cf1aa85a2
Content-Type: application/json

--- request body ---
{"handle":"qa-4a5a99546ccd","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-780d27d4-fdb7-4cdd-9276-702cf1aa85a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_26e7a8e0-449d-4de0-b4b5-63bca5c5adb0"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-24c70a9a-833c-42da-b545-4feed7ea0d77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24c70a9a-833c-42da-b545-4feed7ea0d77
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-24c70a9a-833c-42da-b545-4feed7ea0d77
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
correlation: qa-7cd11638-fab4-430d-8231-bd729afa6be7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cd11638-fab4-430d-8231-bd729afa6be7
Content-Type: application/json

--- request body ---
{"handle":"qa-4a5a99546ccd","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7cd11638-fab4-430d-8231-bd729afa6be7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7cd11638-fab4-430d-8231-bd729afa6be7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-18143e73-94cd-415f-8d54-c7db9bebe730

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18143e73-94cd-415f-8d54-c7db9bebe730
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-18143e73-94cd-415f-8d54-c7db9bebe730
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
correlation: qa-f41901dc-46aa-417d-86f5-db9e6823c8dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f41901dc-46aa-417d-86f5-db9e6823c8dd
Content-Type: application/json

--- request body ---
{"handle":"qa-cff05e07b675","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f41901dc-46aa-417d-86f5-db9e6823c8dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f41901dc-46aa-417d-86f5-db9e6823c8dd"}
```
