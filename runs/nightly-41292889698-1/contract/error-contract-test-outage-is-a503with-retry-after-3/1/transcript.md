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
| 1 | `POST /v1/accounts` | 201 | 395 | `qa-ae7cdb5e-f583-4b1d-9bd7-718b28ba1ead` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-b09c8355-8cad-465e-b3ed-7c4987fafb34` |
| 3 | `POST /v1/auth/token` | 200 | 69 | `qa-0a386632-06f1-45d1-b2d0-9cd37936c1bd` |
| 4 | `POST /v1/conversations` | 201 | 81 | `qa-4a585723-a49f-49ac-bae3-87d705a6f6dd` |
| 5 | `PATCH /v1/accounts/me` | 503 | 38 | `qa-f505eef7-260f-4807-b848-4ecc40d363b0` |
| 6 | `POST /v1/auth/token` | 200 | 58 | `qa-4171da28-a471-41c2-89a6-67e2fbcba579` |
| 7 | `DELETE /v1/accounts/me` | 204 | 46 | `qa-5fb8655d-6d31-4dc5-ba25-b0709a3ec327` |
| 8 | `POST /v1/auth/token` | 401 | 33 | `qa-30e7d372-e7dd-4d6d-98ef-4d9d03df432f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 67 | `qa-c0b6d838-dd7a-4888-9f1e-8af5172aacf0` |
| 10 | `POST /v1/auth/token` | 401 | 47 | `qa-e3d9df15-a117-4f49-bad3-8e2d9a57fc86` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ae7cdb5e-f583-4b1d-9bd7-718b28ba1ead

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae7cdb5e-f583-4b1d-9bd7-718b28ba1ead
Content-Type: application/json

--- request body ---
{"handle":"qa-55c9f6261a73","displayName":"QA 55c9f6261a73","password":"****","region":"eu"}

--- response: 201 in 395 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae7cdb5e-f583-4b1d-9bd7-718b28ba1ead
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Location: /v1/accounts/qa-55c9f6261a73
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1b8f295d-4774-40f7-9d97-77fff66c8973","handle":"qa-55c9f6261a73","displayName":"QA 55c9f6261a73","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.339348162Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b09c8355-8cad-465e-b3ed-7c4987fafb34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b09c8355-8cad-465e-b3ed-7c4987fafb34
Content-Type: application/json

--- request body ---
{"handle":"qa-21eb804156b2","displayName":"QA 21eb804156b2","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-b09c8355-8cad-465e-b3ed-7c4987fafb34
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
Location: /v1/accounts/qa-21eb804156b2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_01c0a46a-b6d9-4bf9-85a8-79c9b9724e71","handle":"qa-21eb804156b2","displayName":"QA 21eb804156b2","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.783886304Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0a386632-06f1-45d1-b2d0-9cd37936c1bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a386632-06f1-45d1-b2d0-9cd37936c1bd
Content-Type: application/json

--- request body ---
{"handle":"qa-55c9f6261a73","password":"****"}

--- response: 200 in 69 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a386632-06f1-45d1-b2d0-9cd37936c1bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1b8f295d-4774-40f7-9d97-77fff66c8973"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4a585723-a49f-49ac-bae3-87d705a6f6dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a585723-a49f-49ac-bae3-87d705a6f6dd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-21eb804156b2","subject":"Error contract","message":"Hi"}

--- response: 201 in 81 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a585723-a49f-49ac-bae3-87d705a6f6dd
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
Location: /v1/conversations/cnv_c36106f2-dc9c-48ac-ae11-77042b94c32c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c36106f2-dc9c-48ac-ae11-77042b94c32c","subject":"Error contract","status":"open","region":"eu","participants":["qa-55c9f6261a73","qa-21eb804156b2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:20.995931166Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-f505eef7-260f-4807-b848-4ecc40d363b0

--- request headers ---
Accept: application/json
X-Fault-Key: 7069d936-c629-42f7-a967-74b1b4687f06
X-Fault: unavailable-once
X-Correlation-Id: qa-f505eef7-260f-4807-b848-4ecc40d363b0
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 38 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f505eef7-260f-4807-b848-4ecc40d363b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-f505eef7-260f-4807-b848-4ecc40d363b0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4171da28-a471-41c2-89a6-67e2fbcba579

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4171da28-a471-41c2-89a6-67e2fbcba579
Content-Type: application/json

--- request body ---
{"handle":"qa-21eb804156b2","password":"****"}

--- response: 200 in 58 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-4171da28-a471-41c2-89a6-67e2fbcba579
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_01c0a46a-b6d9-4bf9-85a8-79c9b9724e71"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5fb8655d-6d31-4dc5-ba25-b0709a3ec327

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fb8655d-6d31-4dc5-ba25-b0709a3ec327
Content-Type: application/json

--- response: 204 in 46 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5fb8655d-6d31-4dc5-ba25-b0709a3ec327
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
correlation: qa-30e7d372-e7dd-4d6d-98ef-4d9d03df432f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30e7d372-e7dd-4d6d-98ef-4d9d03df432f
Content-Type: application/json

--- request body ---
{"handle":"qa-21eb804156b2","password":"****"}

--- response: 401 in 33 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-30e7d372-e7dd-4d6d-98ef-4d9d03df432f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-30e7d372-e7dd-4d6d-98ef-4d9d03df432f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c0b6d838-dd7a-4888-9f1e-8af5172aacf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0b6d838-dd7a-4888-9f1e-8af5172aacf0
Content-Type: application/json

--- response: 204 in 67 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c0b6d838-dd7a-4888-9f1e-8af5172aacf0
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
correlation: qa-e3d9df15-a117-4f49-bad3-8e2d9a57fc86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3d9df15-a117-4f49-bad3-8e2d9a57fc86
Content-Type: application/json

--- request body ---
{"handle":"qa-55c9f6261a73","password":"****"}

--- response: 401 in 47 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e3d9df15-a117-4f49-bad3-8e2d9a57fc86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e3d9df15-a117-4f49-bad3-8e2d9a57fc86"}
```
