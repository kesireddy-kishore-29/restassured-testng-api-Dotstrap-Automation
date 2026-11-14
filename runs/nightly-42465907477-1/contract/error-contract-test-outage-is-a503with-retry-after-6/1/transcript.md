# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-9e8a53e0-2cfa-492a-ab6a-8b85dd442b1d` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-2175c324-38ef-4bb7-b967-6d648236d2e8` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-b3d58403-86ec-4697-9dcf-b799a90bc777` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-adad59bb-664d-49b4-bbcf-f7850170d223` |
| 5 | `POST /v1/conversations` | 503 | 26 | `qa-4920c5a8-7389-4eb6-bbc1-fb901e70368c` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-1c0deab6-41bf-483d-bc86-772500adc932` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-1c9f8db5-ed24-40c6-82d8-3a89b752e6f1` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-d650944a-9e68-4450-9442-65a0b100bd03` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-f61907fa-ef78-4196-a77e-9bb77983d012` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-07eebc29-981a-4b79-8bc6-962d73f3f01c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9e8a53e0-2cfa-492a-ab6a-8b85dd442b1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e8a53e0-2cfa-492a-ab6a-8b85dd442b1d
Content-Type: application/json

--- request body ---
{"handle":"qa-2b0b97d55c54","displayName":"QA 2b0b97d55c54","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e8a53e0-2cfa-492a-ab6a-8b85dd442b1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 9
Location: /v1/accounts/qa-2b0b97d55c54
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1cc2a86f-8708-43ba-b894-edd360656db1","handle":"qa-2b0b97d55c54","displayName":"QA 2b0b97d55c54","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.674595614Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2175c324-38ef-4bb7-b967-6d648236d2e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2175c324-38ef-4bb7-b967-6d648236d2e8
Content-Type: application/json

--- request body ---
{"handle":"qa-d0ce961cc623","displayName":"QA d0ce961cc623","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-2175c324-38ef-4bb7-b967-6d648236d2e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 9
Location: /v1/accounts/qa-d0ce961cc623
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bceb875b-0a58-4f56-b3e5-bba0c13b199f","handle":"qa-d0ce961cc623","displayName":"QA d0ce961cc623","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.707240298Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b3d58403-86ec-4697-9dcf-b799a90bc777

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3d58403-86ec-4697-9dcf-b799a90bc777
Content-Type: application/json

--- request body ---
{"handle":"qa-2b0b97d55c54","password":"****"}

--- response: 200 in 34 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3d58403-86ec-4697-9dcf-b799a90bc777
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1cc2a86f-8708-43ba-b894-edd360656db1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-adad59bb-664d-49b4-bbcf-f7850170d223

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adad59bb-664d-49b4-bbcf-f7850170d223
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d0ce961cc623","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-adad59bb-664d-49b4-bbcf-f7850170d223
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
Location: /v1/conversations/cnv_08b891c3-1499-49d7-8212-c276a27e306a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_08b891c3-1499-49d7-8212-c276a27e306a","subject":"Error contract","status":"open","region":"eu","participants":["qa-2b0b97d55c54","qa-d0ce961cc623"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:02.779053077Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-4920c5a8-7389-4eb6-bbc1-fb901e70368c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 74397dda-18f1-40e5-aa9b-58dac5822d71
X-Correlation-Id: qa-4920c5a8-7389-4eb6-bbc1-fb901e70368c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2b0b97d55c54","subject":"Probe","message":"Hi"}

--- response: 503 in 26 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4920c5a8-7389-4eb6-bbc1-fb901e70368c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-4920c5a8-7389-4eb6-bbc1-fb901e70368c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1c0deab6-41bf-483d-bc86-772500adc932

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c0deab6-41bf-483d-bc86-772500adc932
Content-Type: application/json

--- request body ---
{"handle":"qa-d0ce961cc623","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c0deab6-41bf-483d-bc86-772500adc932
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bceb875b-0a58-4f56-b3e5-bba0c13b199f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1c9f8db5-ed24-40c6-82d8-3a89b752e6f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c9f8db5-ed24-40c6-82d8-3a89b752e6f1
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1c9f8db5-ed24-40c6-82d8-3a89b752e6f1
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
correlation: qa-d650944a-9e68-4450-9442-65a0b100bd03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d650944a-9e68-4450-9442-65a0b100bd03
Content-Type: application/json

--- request body ---
{"handle":"qa-d0ce961cc623","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d650944a-9e68-4450-9442-65a0b100bd03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d650944a-9e68-4450-9442-65a0b100bd03"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f61907fa-ef78-4196-a77e-9bb77983d012

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f61907fa-ef78-4196-a77e-9bb77983d012
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f61907fa-ef78-4196-a77e-9bb77983d012
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
correlation: qa-07eebc29-981a-4b79-8bc6-962d73f3f01c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07eebc29-981a-4b79-8bc6-962d73f3f01c
Content-Type: application/json

--- request body ---
{"handle":"qa-2b0b97d55c54","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-07eebc29-981a-4b79-8bc6-962d73f3f01c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-07eebc29-981a-4b79-8bc6-962d73f3f01c"}
```
