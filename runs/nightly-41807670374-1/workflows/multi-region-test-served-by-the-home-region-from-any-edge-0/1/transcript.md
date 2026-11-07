# Transcript: Requests are served by the home region, whichever edge they arrive at [IN, eu]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[0]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 501 | `qa-599d735b-14ef-4357-95f3-97f96aa1d5ce` |
| 2 | `POST /v1/auth/token` | 200 | 127 | `qa-82264b73-0a65-41ab-923c-d8ed8b894299` |
| 3 | `GET /v1/accounts/me` | 200 | 82 | `qa-670828c0-0578-4e6a-bf31-c47117174df0` |
| 4 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-9d213dbe-39df-40f6-aece-be9bb2e298c6` |
| 5 | `POST /v1/auth/token` | 401 | 77 | `qa-6fdfa09c-02e3-4011-a27a-6109f8c62625` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-599d735b-14ef-4357-95f3-97f96aa1d5ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-599d735b-14ef-4357-95f3-97f96aa1d5ce
Content-Type: application/json

--- request body ---
{"handle":"qa-0b30c65ccf5a","displayName":"QA 0b30c65ccf5a","password":"****","region":"in"}

--- response: 201 in 501 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-599d735b-14ef-4357-95f3-97f96aa1d5ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-0b30c65ccf5a
X-Served-Region: in
Content-Length: 181

{"id":"acc_334665bc-c222-4d7c-845e-ff8ea44c29da","handle":"qa-0b30c65ccf5a","displayName":"QA 0b30c65ccf5a","region":"in","role":"user","createdAt":"2026-11-04T09:28:13.980357143Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-82264b73-0a65-41ab-923c-d8ed8b894299

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82264b73-0a65-41ab-923c-d8ed8b894299
Content-Type: application/json

--- request body ---
{"handle":"qa-0b30c65ccf5a","password":"****"}

--- response: 200 in 127 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-82264b73-0a65-41ab-923c-d8ed8b894299
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_334665bc-c222-4d7c-845e-ff8ea44c29da"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-670828c0-0578-4e6a-bf31-c47117174df0

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-670828c0-0578-4e6a-bf31-c47117174df0
Content-Type: application/json

--- response: 200 in 82 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-670828c0-0578-4e6a-bf31-c47117174df0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: eu
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 181

{"id":"acc_334665bc-c222-4d7c-845e-ff8ea44c29da","handle":"qa-0b30c65ccf5a","displayName":"QA 0b30c65ccf5a","region":"in","role":"user","createdAt":"2026-11-04T09:28:13.980357143Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9d213dbe-39df-40f6-aece-be9bb2e298c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d213dbe-39df-40f6-aece-be9bb2e298c6
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9d213dbe-39df-40f6-aece-be9bb2e298c6
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
X-Served-Region: in
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-6fdfa09c-02e3-4011-a27a-6109f8c62625

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fdfa09c-02e3-4011-a27a-6109f8c62625
Content-Type: application/json

--- request body ---
{"handle":"qa-0b30c65ccf5a","password":"****"}

--- response: 401 in 77 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6fdfa09c-02e3-4011-a27a-6109f8c62625
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6fdfa09c-02e3-4011-a27a-6109f8c62625"}
```
