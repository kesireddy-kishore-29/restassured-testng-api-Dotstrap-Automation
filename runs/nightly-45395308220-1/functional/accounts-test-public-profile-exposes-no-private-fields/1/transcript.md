# Transcript: Anyone signed in sees a public profile with no private fields

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#publicProfileExposesNoPrivateFields` |
| Features | FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-8de059eb-5ec0-44e2-af04-23d93ee913d3` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-5633ec07-0ea6-40a3-98e8-d0c3e45216e6` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-86b51af4-6e23-40ed-8244-b8a64577600e` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 22 | `qa-6423b8b6-e88b-4f32-85ae-99254a729915` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 7 | `qa-e6292759-140d-41f8-b6b8-afef8168fee4` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 13 | `qa-8519a1ad-cd5f-4e2c-a955-50fa9fbf45f5` |
| 7 | `POST /v1/auth/token` | 200 | 19 | `qa-5cb69b26-495a-4f12-a80b-71f3b701aaad` |
| 8 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-b9afe5da-eb9f-4642-9321-dab1819815cd` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-d0cef323-e305-4770-b095-0368c22ee5b0` |
| 10 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-05a90c60-cfee-490a-a848-4c8a08472896` |
| 11 | `POST /v1/auth/token` | 401 | 13 | `qa-48ecac6c-63c6-4763-aefd-631e125beb54` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8de059eb-5ec0-44e2-af04-23d93ee913d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8de059eb-5ec0-44e2-af04-23d93ee913d3
Content-Type: application/json

--- request body ---
{"handle":"qa-742f115c6bcb","displayName":"QA 742f115c6bcb","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-8de059eb-5ec0-44e2-af04-23d93ee913d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-742f115c6bcb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0d9edbdb-e152-4051-b1db-72b9fa71197b","handle":"qa-742f115c6bcb","displayName":"QA 742f115c6bcb","region":"eu","role":"user","createdAt":"2026-11-24T12:38:05.121158693Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5633ec07-0ea6-40a3-98e8-d0c3e45216e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5633ec07-0ea6-40a3-98e8-d0c3e45216e6
Content-Type: application/json

--- request body ---
{"handle":"qa-a923a100658e","displayName":"QA a923a100658e","password":"****","region":"us"}

--- response: 201 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-5633ec07-0ea6-40a3-98e8-d0c3e45216e6
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
Location: /v1/accounts/qa-a923a100658e
X-Served-Region: us
Content-Length: 181

{"id":"acc_a646efc3-1d89-4ff6-b4a6-ae308d5d9e11","handle":"qa-a923a100658e","displayName":"QA a923a100658e","region":"us","role":"user","createdAt":"2026-11-24T12:38:05.152356549Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-86b51af4-6e23-40ed-8244-b8a64577600e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86b51af4-6e23-40ed-8244-b8a64577600e
Content-Type: application/json

--- request body ---
{"handle":"qa-742f115c6bcb","password":"****"}

--- response: 200 in 30 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-86b51af4-6e23-40ed-8244-b8a64577600e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0d9edbdb-e152-4051-b1db-72b9fa71197b"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-a923a100658e
correlation: qa-6423b8b6-e88b-4f32-85ae-99254a729915

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6423b8b6-e88b-4f32-85ae-99254a729915
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-6423b8b6-e88b-4f32-85ae-99254a729915
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
Content-Length: 74

{"handle":"qa-a923a100658e","displayName":"QA a923a100658e","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-a923a100658e
correlation: qa-e6292759-140d-41f8-b6b8-afef8168fee4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6292759-140d-41f8-b6b8-afef8168fee4
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6292759-140d-41f8-b6b8-afef8168fee4
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
Content-Length: 74

{"handle":"qa-a923a100658e","displayName":"QA a923a100658e","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-a923a100658e
correlation: qa-8519a1ad-cd5f-4e2c-a955-50fa9fbf45f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8519a1ad-cd5f-4e2c-a955-50fa9fbf45f5
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-8519a1ad-cd5f-4e2c-a955-50fa9fbf45f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 74

{"handle":"qa-a923a100658e","displayName":"QA a923a100658e","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-5cb69b26-495a-4f12-a80b-71f3b701aaad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cb69b26-495a-4f12-a80b-71f3b701aaad
Content-Type: application/json

--- request body ---
{"handle":"qa-a923a100658e","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-5cb69b26-495a-4f12-a80b-71f3b701aaad
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a646efc3-1d89-4ff6-b4a6-ae308d5d9e11"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b9afe5da-eb9f-4642-9321-dab1819815cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9afe5da-eb9f-4642-9321-dab1819815cd
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b9afe5da-eb9f-4642-9321-dab1819815cd
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
X-Served-Region: us
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-d0cef323-e305-4770-b095-0368c22ee5b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0cef323-e305-4770-b095-0368c22ee5b0
Content-Type: application/json

--- request body ---
{"handle":"qa-a923a100658e","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d0cef323-e305-4770-b095-0368c22ee5b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d0cef323-e305-4770-b095-0368c22ee5b0"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-05a90c60-cfee-490a-a848-4c8a08472896

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05a90c60-cfee-490a-a848-4c8a08472896
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-05a90c60-cfee-490a-a848-4c8a08472896
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-48ecac6c-63c6-4763-aefd-631e125beb54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48ecac6c-63c6-4763-aefd-631e125beb54
Content-Type: application/json

--- request body ---
{"handle":"qa-742f115c6bcb","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48ecac6c-63c6-4763-aefd-631e125beb54
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-48ecac6c-63c6-4763-aefd-631e125beb54"}
```
