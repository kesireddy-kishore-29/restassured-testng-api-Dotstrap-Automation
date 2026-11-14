# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 531 | `qa-da2bd59d-3655-461d-a594-1a23d1605fc6` |
| 2 | `POST /v1/auth/token` | 200 | 35 | `qa-e2f5cb4a-b92f-42a0-b54b-c46c416d91a3` |
| 3 | `GET /v1/conversations/{id}` | 404 | 78 | `qa-faadb6dc-0b4b-4eec-a60d-0ee3e43de455` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 21 | `qa-09acf068-02b7-4f54-9708-a3c815efaffc` |
| 5 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-10c44014-f084-4424-983b-6b4a33d33f7c` |
| 6 | `POST /v1/auth/token` | 401 | 18 | `qa-c3172bdd-51c0-47ba-897f-7c0fcf7e2313` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-da2bd59d-3655-461d-a594-1a23d1605fc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da2bd59d-3655-461d-a594-1a23d1605fc6
Content-Type: application/json

--- request body ---
{"handle":"qa-25913e42dac9","displayName":"QA 25913e42dac9","password":"****","region":"eu"}

--- response: 201 in 531 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-da2bd59d-3655-461d-a594-1a23d1605fc6
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
Location: /v1/accounts/qa-25913e42dac9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bdaaa309-2457-4c61-bcc6-82a9e2f9ef51","handle":"qa-25913e42dac9","displayName":"QA 25913e42dac9","region":"eu","role":"user","createdAt":"2026-11-14T09:05:20.274917060Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e2f5cb4a-b92f-42a0-b54b-c46c416d91a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2f5cb4a-b92f-42a0-b54b-c46c416d91a3
Content-Type: application/json

--- request body ---
{"handle":"qa-25913e42dac9","password":"****"}

--- response: 200 in 35 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2f5cb4a-b92f-42a0-b54b-c46c416d91a3
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bdaaa309-2457-4c61-bcc6-82a9e2f9ef51"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-faadb6dc-0b4b-4eec-a60d-0ee3e43de455

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-faadb6dc-0b4b-4eec-a60d-0ee3e43de455
Content-Type: application/json

--- response: 404 in 78 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-faadb6dc-0b4b-4eec-a60d-0ee3e43de455
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-faadb6dc-0b4b-4eec-a60d-0ee3e43de455"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-09acf068-02b7-4f54-9708-a3c815efaffc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09acf068-02b7-4f54-9708-a3c815efaffc
Content-Type: application/json

--- response: 404 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09acf068-02b7-4f54-9708-a3c815efaffc
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-09acf068-02b7-4f54-9708-a3c815efaffc"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-10c44014-f084-4424-983b-6b4a33d33f7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10c44014-f084-4424-983b-6b4a33d33f7c
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-10c44014-f084-4424-983b-6b4a33d33f7c
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
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c3172bdd-51c0-47ba-897f-7c0fcf7e2313

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3172bdd-51c0-47ba-897f-7c0fcf7e2313
Content-Type: application/json

--- request body ---
{"handle":"qa-25913e42dac9","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3172bdd-51c0-47ba-897f-7c0fcf7e2313
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c3172bdd-51c0-47ba-897f-7c0fcf7e2313"}
```
