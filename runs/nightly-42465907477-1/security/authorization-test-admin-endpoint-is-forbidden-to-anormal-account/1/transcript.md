# Transcript: A normal account cannot use the admin endpoint

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#adminEndpointIsForbiddenToANormalAccount` |
| Features | FEAT-SEC-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 402 | `qa-b1bd96bc-744a-4ec2-a0b7-2fdddcef01b7` |
| 2 | `POST /v1/auth/token` | 200 | 32 | `qa-1b8f704c-5833-4292-873c-726f2b9d455b` |
| 3 | `GET /v1/admin/stats` | 403 | 42 | `qa-06de9212-a2ad-4842-9075-8114b80b8bdc` |
| 4 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-71f8560c-da19-44c5-a487-5493609e799f` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-e82c4309-a687-41ca-8367-c0476840f865` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b1bd96bc-744a-4ec2-a0b7-2fdddcef01b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1bd96bc-744a-4ec2-a0b7-2fdddcef01b7
Content-Type: application/json

--- request body ---
{"handle":"qa-f944c8bd07ab","displayName":"QA f944c8bd07ab","password":"****","region":"eu"}

--- response: 201 in 402 ms ---
Date: Sun, 08 Nov 2026 09:09:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1bd96bc-744a-4ec2-a0b7-2fdddcef01b7
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
Location: /v1/accounts/qa-f944c8bd07ab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_336a2494-0769-450b-a27e-38d36a20017a","handle":"qa-f944c8bd07ab","displayName":"QA f944c8bd07ab","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.863456655Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1b8f704c-5833-4292-873c-726f2b9d455b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b8f704c-5833-4292-873c-726f2b9d455b
Content-Type: application/json

--- request body ---
{"handle":"qa-f944c8bd07ab","password":"****"}

--- response: 200 in 32 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b8f704c-5833-4292-873c-726f2b9d455b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_336a2494-0769-450b-a27e-38d36a20017a"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-06de9212-a2ad-4842-9075-8114b80b8bdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06de9212-a2ad-4842-9075-8114b80b8bdc
Content-Type: application/json

--- response: 403 in 42 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-06de9212-a2ad-4842-9075-8114b80b8bdc
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
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-06de9212-a2ad-4842-9075-8114b80b8bdc"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-71f8560c-da19-44c5-a487-5493609e799f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71f8560c-da19-44c5-a487-5493609e799f
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-71f8560c-da19-44c5-a487-5493609e799f
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-e82c4309-a687-41ca-8367-c0476840f865

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e82c4309-a687-41ca-8367-c0476840f865
Content-Type: application/json

--- request body ---
{"handle":"qa-f944c8bd07ab","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e82c4309-a687-41ca-8367-c0476840f865
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e82c4309-a687-41ca-8367-c0476840f865"}
```
