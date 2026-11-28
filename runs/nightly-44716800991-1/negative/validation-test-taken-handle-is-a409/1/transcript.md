# Transcript: A handle that is already taken is a 409

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#takenHandleIsA409` |
| Features | FEAT-ACCT-01, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 310 | `qa-a4f43743-5398-4fec-850a-a7a5ae9f6905` |
| 2 | `POST /v1/accounts` | 409 | 8 | `qa-08eed280-bda2-4059-b108-b3d9734e6778` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-7b2048c0-7afc-4cfe-906b-d372ad426589` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-74c15774-4326-4147-a9a7-383c99475b4b` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-08a1f05b-e1bb-4768-80f6-6d18378f9b07` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a4f43743-5398-4fec-850a-a7a5ae9f6905

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4f43743-5398-4fec-850a-a7a5ae9f6905
Content-Type: application/json

--- request body ---
{"handle":"qa-ebc6d30371b5","displayName":"QA ebc6d30371b5","password":"****","region":"eu"}

--- response: 201 in 310 ms ---
Date: Fri, 20 Nov 2026 10:09:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4f43743-5398-4fec-850a-a7a5ae9f6905
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-ebc6d30371b5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_48d32442-e0b9-438a-90d7-bc65ebfa7de5","handle":"qa-ebc6d30371b5","displayName":"QA ebc6d30371b5","region":"eu","role":"user","createdAt":"2026-11-20T10:09:51.772668292Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-08eed280-bda2-4059-b108-b3d9734e6778

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08eed280-bda2-4059-b108-b3d9734e6778
Content-Type: application/json

--- request body ---
{"handle":"qa-ebc6d30371b5","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 8 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08eed280-bda2-4059-b108-b3d9734e6778
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-ebc6d30371b5' is in use.","instance":"/v1/accounts","correlationId":"qa-08eed280-bda2-4059-b108-b3d9734e6778"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7b2048c0-7afc-4cfe-906b-d372ad426589

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b2048c0-7afc-4cfe-906b-d372ad426589
Content-Type: application/json

--- request body ---
{"handle":"qa-ebc6d30371b5","password":"****"}

--- response: 200 in 41 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b2048c0-7afc-4cfe-906b-d372ad426589
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_48d32442-e0b9-438a-90d7-bc65ebfa7de5"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-74c15774-4326-4147-a9a7-383c99475b4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74c15774-4326-4147-a9a7-383c99475b4b
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-74c15774-4326-4147-a9a7-383c99475b4b
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-08a1f05b-e1bb-4768-80f6-6d18378f9b07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08a1f05b-e1bb-4768-80f6-6d18378f9b07
Content-Type: application/json

--- request body ---
{"handle":"qa-ebc6d30371b5","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08a1f05b-e1bb-4768-80f6-6d18378f9b07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-08a1f05b-e1bb-4768-80f6-6d18378f9b07"}
```
