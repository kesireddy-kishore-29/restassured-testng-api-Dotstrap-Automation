# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 411 | `qa-9c5d3661-b263-4b99-9a50-29e578566ddd` |
| 2 | `POST /v1/accounts` | 201 | 74 | `qa-b6347d81-3799-49b4-b85f-72e9a7b59b20` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-227276ef-22b0-4772-83be-068bda2f2eef` |
| 4 | `POST /v1/conversations` | 201 | 73 | `qa-83131430-f9cc-46ab-95da-a390f1dfb4bf` |
| 5 | `POST /v1/accounts` | 503 | 53 | `qa-e4b70ed8-d5aa-4cbc-a832-02e31ba9dce7` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-2c9face9-f0fd-4372-91db-8bab4205ee46` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-d5d1ca63-856d-4bcd-8657-6b377493d9aa` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-10678d52-3dd1-4241-9976-683c5db04f03` |
| 9 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-bd39131b-30b3-493f-ad10-3f641144b965` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-1e792728-8170-459b-8e89-f51b3600b040` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9c5d3661-b263-4b99-9a50-29e578566ddd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c5d3661-b263-4b99-9a50-29e578566ddd
Content-Type: application/json

--- request body ---
{"handle":"qa-924abe064c46","displayName":"QA 924abe064c46","password":"****","region":"eu"}

--- response: 201 in 411 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c5d3661-b263-4b99-9a50-29e578566ddd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Location: /v1/accounts/qa-924abe064c46
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ba0332-d533-40ca-bbcb-d859d62513a2","handle":"qa-924abe064c46","displayName":"QA 924abe064c46","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.378347555Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b6347d81-3799-49b4-b85f-72e9a7b59b20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6347d81-3799-49b4-b85f-72e9a7b59b20
Content-Type: application/json

--- request body ---
{"handle":"qa-8761e8870605","displayName":"QA 8761e8870605","password":"****","region":"eu"}

--- response: 201 in 74 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6347d81-3799-49b4-b85f-72e9a7b59b20
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
Location: /v1/accounts/qa-8761e8870605
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f14cd93f-caf2-4f31-a1c6-bd8e4abfbf94","handle":"qa-8761e8870605","displayName":"QA 8761e8870605","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.837584809Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-227276ef-22b0-4772-83be-068bda2f2eef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-227276ef-22b0-4772-83be-068bda2f2eef
Content-Type: application/json

--- request body ---
{"handle":"qa-924abe064c46","password":"****"}

--- response: 200 in 35 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-227276ef-22b0-4772-83be-068bda2f2eef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a3ba0332-d533-40ca-bbcb-d859d62513a2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-83131430-f9cc-46ab-95da-a390f1dfb4bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83131430-f9cc-46ab-95da-a390f1dfb4bf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8761e8870605","subject":"Error contract","message":"Hi"}

--- response: 201 in 73 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-83131430-f9cc-46ab-95da-a390f1dfb4bf
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
Location: /v1/conversations/cnv_f55fc8f7-28de-4705-a986-4fe325e3ba4d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f55fc8f7-28de-4705-a986-4fe325e3ba4d","subject":"Error contract","status":"open","region":"eu","participants":["qa-924abe064c46","qa-8761e8870605"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:20.992672251Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-e4b70ed8-d5aa-4cbc-a832-02e31ba9dce7

--- request headers ---
Accept: application/json
X-Fault-Key: b685ee63-bec1-4ea1-819a-9e43fc6fc6f0
X-Fault: unavailable-once
X-Correlation-Id: qa-e4b70ed8-d5aa-4cbc-a832-02e31ba9dce7
Content-Type: application/json

--- request body ---
{"handle":"qa-df3f97e7ee97","displayName":"QA df3f97e7ee97","password":"****","region":"eu"}

--- response: 503 in 53 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4b70ed8-d5aa-4cbc-a832-02e31ba9dce7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-e4b70ed8-d5aa-4cbc-a832-02e31ba9dce7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2c9face9-f0fd-4372-91db-8bab4205ee46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c9face9-f0fd-4372-91db-8bab4205ee46
Content-Type: application/json

--- request body ---
{"handle":"qa-8761e8870605","password":"****"}

--- response: 200 in 32 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c9face9-f0fd-4372-91db-8bab4205ee46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f14cd93f-caf2-4f31-a1c6-bd8e4abfbf94"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d5d1ca63-856d-4bcd-8657-6b377493d9aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5d1ca63-856d-4bcd-8657-6b377493d9aa
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d5d1ca63-856d-4bcd-8657-6b377493d9aa
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
correlation: qa-10678d52-3dd1-4241-9976-683c5db04f03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10678d52-3dd1-4241-9976-683c5db04f03
Content-Type: application/json

--- request body ---
{"handle":"qa-8761e8870605","password":"****"}

--- response: 401 in 27 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10678d52-3dd1-4241-9976-683c5db04f03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-10678d52-3dd1-4241-9976-683c5db04f03"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bd39131b-30b3-493f-ad10-3f641144b965

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd39131b-30b3-493f-ad10-3f641144b965
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bd39131b-30b3-493f-ad10-3f641144b965
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
correlation: qa-1e792728-8170-459b-8e89-f51b3600b040

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e792728-8170-459b-8e89-f51b3600b040
Content-Type: application/json

--- request body ---
{"handle":"qa-924abe064c46","password":"****"}

--- response: 401 in 20 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e792728-8170-459b-8e89-f51b3600b040
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1e792728-8170-459b-8e89-f51b3600b040"}
```
