# Transcript: Requests are served by the home region, whichever edge they arrive at [US, in]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[2]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 485 | `qa-b5e125d4-f217-4578-bab1-62bf12ed2c05` |
| 2 | `POST /v1/auth/token` | 200 | 86 | `qa-4bd4ee17-02ac-4e9a-85be-41bf8bf8b143` |
| 3 | `GET /v1/accounts/me` | 200 | 35 | `qa-01d50515-2cee-438d-8723-b7df3ebafc3f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-db81e39c-e1f1-4978-8256-e3f6f2bf284c` |
| 5 | `POST /v1/auth/token` | 401 | 26 | `qa-51950e8f-bf59-4ccf-aff3-e10d1cdb7871` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b5e125d4-f217-4578-bab1-62bf12ed2c05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5e125d4-f217-4578-bab1-62bf12ed2c05
Content-Type: application/json

--- request body ---
{"handle":"qa-beebae0e8134","displayName":"QA beebae0e8134","password":"****","region":"us"}

--- response: 201 in 485 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5e125d4-f217-4578-bab1-62bf12ed2c05
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-beebae0e8134
X-Served-Region: us
Content-Length: 181

{"id":"acc_5e8e8240-6e3b-4c05-8bb8-378cf08e151f","handle":"qa-beebae0e8134","displayName":"QA beebae0e8134","region":"us","role":"user","createdAt":"2026-10-29T08:38:57.208573952Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4bd4ee17-02ac-4e9a-85be-41bf8bf8b143

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bd4ee17-02ac-4e9a-85be-41bf8bf8b143
Content-Type: application/json

--- request body ---
{"handle":"qa-beebae0e8134","password":"****"}

--- response: 200 in 86 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bd4ee17-02ac-4e9a-85be-41bf8bf8b143
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5e8e8240-6e3b-4c05-8bb8-378cf08e151f"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-01d50515-2cee-438d-8723-b7df3ebafc3f

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-01d50515-2cee-438d-8723-b7df3ebafc3f
Content-Type: application/json

--- response: 200 in 35 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-01d50515-2cee-438d-8723-b7df3ebafc3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: in
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 181

{"id":"acc_5e8e8240-6e3b-4c05-8bb8-378cf08e151f","handle":"qa-beebae0e8134","displayName":"QA beebae0e8134","region":"us","role":"user","createdAt":"2026-10-29T08:38:57.208573952Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-db81e39c-e1f1-4978-8256-e3f6f2bf284c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db81e39c-e1f1-4978-8256-e3f6f2bf284c
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-db81e39c-e1f1-4978-8256-e3f6f2bf284c
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
X-Served-Region: us
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-51950e8f-bf59-4ccf-aff3-e10d1cdb7871

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51950e8f-bf59-4ccf-aff3-e10d1cdb7871
Content-Type: application/json

--- request body ---
{"handle":"qa-beebae0e8134","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51950e8f-bf59-4ccf-aff3-e10d1cdb7871
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-51950e8f-bf59-4ccf-aff3-e10d1cdb7871"}
```
