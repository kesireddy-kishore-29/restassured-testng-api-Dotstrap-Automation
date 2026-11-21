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
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-3347c9ff-30ee-4e5a-abd1-e8fe3efe157d` |
| 2 | `POST /v1/accounts` | 201 | 10 | `qa-385de4da-143e-43f5-b877-d279e63ce905` |
| 3 | `POST /v1/auth/token` | 200 | 97 | `qa-f7887ce8-6458-4375-a812-d343217f923b` |
| 4 | `POST /v1/conversations` | 201 | 38 | `qa-73b3307a-880f-4a3c-8ef6-f41a001801d6` |
| 5 | `GET /v1/accounts/me` | 503 | 21 | `qa-dfee659a-6f06-4d5e-8028-3c5614782405` |
| 6 | `POST /v1/auth/token` | 200 | 62 | `qa-bff26190-b3cc-4b92-8ec6-3ebf11ab2052` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-a70cdceb-676d-40c4-948c-9c8686ba21bf` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-91683007-aeae-4f82-81b3-d727d62df16d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 59 | `qa-79aea482-861e-4863-a2e3-1650f54fe726` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-27cf511f-5b39-4050-a738-e5f798c7cb71` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3347c9ff-30ee-4e5a-abd1-e8fe3efe157d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3347c9ff-30ee-4e5a-abd1-e8fe3efe157d
Content-Type: application/json

--- request body ---
{"handle":"qa-4bc5e774cc88","displayName":"QA 4bc5e774cc88","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-3347c9ff-30ee-4e5a-abd1-e8fe3efe157d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Location: /v1/accounts/qa-4bc5e774cc88
X-Served-Region: eu
Content-Length: 181

{"id":"acc_994b0d45-5289-4673-b09e-9a124b943c29","handle":"qa-4bc5e774cc88","displayName":"QA 4bc5e774cc88","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.421921882Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-385de4da-143e-43f5-b877-d279e63ce905

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-385de4da-143e-43f5-b877-d279e63ce905
Content-Type: application/json

--- request body ---
{"handle":"qa-967e8157cc18","displayName":"QA 967e8157cc18","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-385de4da-143e-43f5-b877-d279e63ce905
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-967e8157cc18
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3913812b-1a42-48b5-8459-c753f50feed1","handle":"qa-967e8157cc18","displayName":"QA 967e8157cc18","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.437701522Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f7887ce8-6458-4375-a812-d343217f923b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7887ce8-6458-4375-a812-d343217f923b
Content-Type: application/json

--- request body ---
{"handle":"qa-4bc5e774cc88","password":"****"}

--- response: 200 in 97 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7887ce8-6458-4375-a812-d343217f923b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_994b0d45-5289-4673-b09e-9a124b943c29"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-73b3307a-880f-4a3c-8ef6-f41a001801d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73b3307a-880f-4a3c-8ef6-f41a001801d6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-967e8157cc18","subject":"Error contract","message":"Hi"}

--- response: 201 in 38 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-73b3307a-880f-4a3c-8ef6-f41a001801d6
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
Location: /v1/conversations/cnv_e143d337-6438-4af6-bc96-38e8d90e604e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e143d337-6438-4af6-bc96-38e8d90e604e","subject":"Error contract","status":"open","region":"eu","participants":["qa-4bc5e774cc88","qa-967e8157cc18"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:00.611907671Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-dfee659a-6f06-4d5e-8028-3c5614782405

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: ceb5a0a0-5fd0-4db8-b493-d102de62b6b6
X-Correlation-Id: qa-dfee659a-6f06-4d5e-8028-3c5614782405
Content-Type: application/json

--- response: 503 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dfee659a-6f06-4d5e-8028-3c5614782405
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-dfee659a-6f06-4d5e-8028-3c5614782405"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bff26190-b3cc-4b92-8ec6-3ebf11ab2052

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bff26190-b3cc-4b92-8ec6-3ebf11ab2052
Content-Type: application/json

--- request body ---
{"handle":"qa-967e8157cc18","password":"****"}

--- response: 200 in 62 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-bff26190-b3cc-4b92-8ec6-3ebf11ab2052
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3913812b-1a42-48b5-8459-c753f50feed1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a70cdceb-676d-40c4-948c-9c8686ba21bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a70cdceb-676d-40c4-948c-9c8686ba21bf
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a70cdceb-676d-40c4-948c-9c8686ba21bf
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
correlation: qa-91683007-aeae-4f82-81b3-d727d62df16d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91683007-aeae-4f82-81b3-d727d62df16d
Content-Type: application/json

--- request body ---
{"handle":"qa-967e8157cc18","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-91683007-aeae-4f82-81b3-d727d62df16d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-91683007-aeae-4f82-81b3-d727d62df16d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-79aea482-861e-4863-a2e3-1650f54fe726

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79aea482-861e-4863-a2e3-1650f54fe726
Content-Type: application/json

--- response: 204 in 59 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-79aea482-861e-4863-a2e3-1650f54fe726
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
correlation: qa-27cf511f-5b39-4050-a738-e5f798c7cb71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27cf511f-5b39-4050-a738-e5f798c7cb71
Content-Type: application/json

--- request body ---
{"handle":"qa-4bc5e774cc88","password":"****"}

--- response: 401 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27cf511f-5b39-4050-a738-e5f798c7cb71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-27cf511f-5b39-4050-a738-e5f798c7cb71"}
```
