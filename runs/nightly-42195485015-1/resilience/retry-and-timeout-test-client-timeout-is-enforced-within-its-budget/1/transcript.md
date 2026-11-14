# Transcript: A slow server cannot hang the client

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#clientTimeoutIsEnforcedWithinItsBudget` |
| Features | FEAT-RES-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-ec2eba48-28b0-4186-a0e4-ce01c284cc55` |
| 2 | `POST /v1/auth/token` | 200 | 33 | `qa-40f43c7c-3867-4e6a-bd43-363aa1f6780c` |
| 3 | `GET /v1/accounts/me` | error | 820 | `qa-1d37969b-b275-49fe-b7dc-8e51957fbefa` |
| 4 | `GET /v1/accounts/me` | error | 817 | `qa-0e785506-4a92-4d0e-93fc-e3844cee4caa` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-53ea68d3-0ffa-4901-8a26-ce4692bb6aee` |
| 6 | `POST /v1/auth/token` | 401 | 6 | `qa-08ab5f0a-c363-4a94-823c-423c7f67bc02` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ec2eba48-28b0-4186-a0e4-ce01c284cc55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec2eba48-28b0-4186-a0e4-ce01c284cc55
Content-Type: application/json

--- request body ---
{"handle":"qa-ec6ea678dffd","displayName":"QA ec6ea678dffd","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec2eba48-28b0-4186-a0e4-ce01c284cc55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-ec6ea678dffd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_43392b2f-f5dd-4971-93fd-9e208bdbd963","handle":"qa-ec6ea678dffd","displayName":"QA ec6ea678dffd","region":"eu","role":"user","createdAt":"2026-11-06T09:30:32.291941690Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-40f43c7c-3867-4e6a-bd43-363aa1f6780c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40f43c7c-3867-4e6a-bd43-363aa1f6780c
Content-Type: application/json

--- request body ---
{"handle":"qa-ec6ea678dffd","password":"****"}

--- response: 200 in 33 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-40f43c7c-3867-4e6a-bd43-363aa1f6780c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_43392b2f-f5dd-4971-93fd-9e208bdbd963"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-1d37969b-b275-49fe-b7dc-8e51957fbefa

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 820c12cf-84e5-46d4-afca-337b70f3aed5
X-Correlation-Id: qa-1d37969b-b275-49fe-b7dc-8e51957fbefa
Content-Type: application/json

--- response: none in 820 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e785506-4a92-4d0e-93fc-e3844cee4caa

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 820c12cf-84e5-46d4-afca-337b70f3aed5
X-Correlation-Id: qa-0e785506-4a92-4d0e-93fc-e3844cee4caa
Content-Type: application/json

--- response: none in 817 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-53ea68d3-0ffa-4901-8a26-ce4692bb6aee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53ea68d3-0ffa-4901-8a26-ce4692bb6aee
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-53ea68d3-0ffa-4901-8a26-ce4692bb6aee
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-08ab5f0a-c363-4a94-823c-423c7f67bc02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08ab5f0a-c363-4a94-823c-423c7f67bc02
Content-Type: application/json

--- request body ---
{"handle":"qa-ec6ea678dffd","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08ab5f0a-c363-4a94-823c-423c7f67bc02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-08ab5f0a-c363-4a94-823c-423c7f67bc02"}
```
