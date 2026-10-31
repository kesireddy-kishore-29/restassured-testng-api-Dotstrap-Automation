# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-46883251-89ff-4876-99f5-da41771f91c3` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-038cdcee-3d03-4630-a158-2fd4e0bb25aa` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-a6ae394f-5983-48f8-bf99-354e74f8eced` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-2fd89084-622c-436f-b0d3-c1626e4317f9` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 11 | `qa-9184291d-ee7f-4375-a095-00e9af71dc24` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-504b9715-e5cc-47f6-be36-8bafa7e5c028` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-8b204edc-61c5-4907-881a-a42c0477d279` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-f22b8cd9-05ad-4d65-9dff-ce451fd8e929` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-a808a88d-ff65-45cc-aa01-ebdca77c257f` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-73011458-fa00-4e89-83f4-ce3ce0d2d29a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-46883251-89ff-4876-99f5-da41771f91c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46883251-89ff-4876-99f5-da41771f91c3
Content-Type: application/json

--- request body ---
{"handle":"qa-5bb79b310721","displayName":"QA 5bb79b310721","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-46883251-89ff-4876-99f5-da41771f91c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 8
Location: /v1/accounts/qa-5bb79b310721
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c4a1b043-1fc4-4f02-9ab3-3afc5024e188","handle":"qa-5bb79b310721","displayName":"QA 5bb79b310721","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.280673204Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-038cdcee-3d03-4630-a158-2fd4e0bb25aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-038cdcee-3d03-4630-a158-2fd4e0bb25aa
Content-Type: application/json

--- request body ---
{"handle":"qa-ce9c347209a1","displayName":"QA ce9c347209a1","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-038cdcee-3d03-4630-a158-2fd4e0bb25aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 8
Location: /v1/accounts/qa-ce9c347209a1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1efd2dd8-4656-46c1-82b8-514cb17c06eb","handle":"qa-ce9c347209a1","displayName":"QA ce9c347209a1","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.319203038Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a6ae394f-5983-48f8-bf99-354e74f8eced

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6ae394f-5983-48f8-bf99-354e74f8eced
Content-Type: application/json

--- request body ---
{"handle":"qa-5bb79b310721","password":"****"}

--- response: 200 in 37 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6ae394f-5983-48f8-bf99-354e74f8eced
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c4a1b043-1fc4-4f02-9ab3-3afc5024e188"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2fd89084-622c-436f-b0d3-c1626e4317f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fd89084-622c-436f-b0d3-c1626e4317f9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ce9c347209a1","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fd89084-622c-436f-b0d3-c1626e4317f9
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
Location: /v1/conversations/cnv_390ff495-bf5b-4cd8-b4bc-0612d6e437e4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_390ff495-bf5b-4cd8-b4bc-0612d6e437e4","subject":"Error contract","status":"open","region":"eu","participants":["qa-5bb79b310721","qa-ce9c347209a1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.412969356Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_390ff495-bf5b-4cd8-b4bc-0612d6e437e4/close
correlation: qa-9184291d-ee7f-4375-a095-00e9af71dc24

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 55c7402d-ccbe-420d-a4e1-5c14b0ea4f86
X-Correlation-Id: qa-9184291d-ee7f-4375-a095-00e9af71dc24
Content-Type: application/json

--- response: 503 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9184291d-ee7f-4375-a095-00e9af71dc24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_390ff495-bf5b-4cd8-b4bc-0612d6e437e4/close","correlationId":"qa-9184291d-ee7f-4375-a095-00e9af71dc24"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-504b9715-e5cc-47f6-be36-8bafa7e5c028

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-504b9715-e5cc-47f6-be36-8bafa7e5c028
Content-Type: application/json

--- request body ---
{"handle":"qa-ce9c347209a1","password":"****"}

--- response: 200 in 40 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-504b9715-e5cc-47f6-be36-8bafa7e5c028
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1efd2dd8-4656-46c1-82b8-514cb17c06eb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8b204edc-61c5-4907-881a-a42c0477d279

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b204edc-61c5-4907-881a-a42c0477d279
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8b204edc-61c5-4907-881a-a42c0477d279
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
correlation: qa-f22b8cd9-05ad-4d65-9dff-ce451fd8e929

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f22b8cd9-05ad-4d65-9dff-ce451fd8e929
Content-Type: application/json

--- request body ---
{"handle":"qa-ce9c347209a1","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f22b8cd9-05ad-4d65-9dff-ce451fd8e929
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f22b8cd9-05ad-4d65-9dff-ce451fd8e929"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a808a88d-ff65-45cc-aa01-ebdca77c257f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a808a88d-ff65-45cc-aa01-ebdca77c257f
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a808a88d-ff65-45cc-aa01-ebdca77c257f
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
correlation: qa-73011458-fa00-4e89-83f4-ce3ce0d2d29a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73011458-fa00-4e89-83f4-ce3ce0d2d29a
Content-Type: application/json

--- request body ---
{"handle":"qa-5bb79b310721","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73011458-fa00-4e89-83f4-ce3ce0d2d29a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-73011458-fa00-4e89-83f4-ce3ce0d2d29a"}
```
