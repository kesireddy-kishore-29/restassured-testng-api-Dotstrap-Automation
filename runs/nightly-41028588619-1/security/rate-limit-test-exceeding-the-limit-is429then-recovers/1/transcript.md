# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 83 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 406 | `qa-91e2556f-b32f-4073-ab76-97a6ace6b66a` |
| 2 | `POST /v1/auth/token` | 200 | 64 | `qa-502dbf22-e5e1-47bd-bfb9-2ab65eb63bc8` |
| 3 | `GET /v1/accounts/me` | 200 | 38 | `qa-310cc92a-a393-4f0b-9730-e2205b08029b` |
| 4 | `GET /v1/accounts/me` | 200 | 11 | `qa-570b8455-a634-4303-ade8-a6ddbabbb81d` |
| 5 | `GET /v1/accounts/me` | 200 | 12 | `qa-b6e3cc74-a9a3-407c-a8e8-c651bc50b91a` |
| 6 | `GET /v1/accounts/me` | 200 | 14 | `qa-6ab13740-9bd4-48ae-bb3d-b572212e3db2` |
| 7 | `GET /v1/accounts/me` | 200 | 9 | `qa-535039f6-5cc1-4cb5-b673-c9296a0bb887` |
| 8 | `GET /v1/accounts/me` | 200 | 9 | `qa-d9deef72-bd5f-4574-b9f0-181088a3745e` |
| 9 | `GET /v1/accounts/me` | 200 | 14 | `qa-cca0bbe0-18ee-468f-ad66-f9f2481c2155` |
| 10 | `GET /v1/accounts/me` | 200 | 14 | `qa-603fdd67-b846-4f64-8cdf-e0e740a83f04` |
| 11 | `GET /v1/accounts/me` | 200 | 23 | `qa-56a80656-7f6b-4e92-b8ee-6a9024491497` |
| 12 | `GET /v1/accounts/me` | 200 | 15 | `qa-fa34f02a-c2cf-42bb-91a3-e5f06eb448d6` |
| 13 | `GET /v1/accounts/me` | 200 | 16 | `qa-0137dddc-2f5d-4134-bcaa-7d85f208dd31` |
| 14 | `GET /v1/accounts/me` | 200 | 15 | `qa-e42fa717-2135-4996-9dd8-2959892f98ec` |
| 15 | `GET /v1/accounts/me` | 200 | 12 | `qa-46fe7c57-4811-4597-8c6c-640fab255a3d` |
| 16 | `GET /v1/accounts/me` | 200 | 11 | `qa-2f99a138-de97-42fc-8c73-01d56ffbd424` |
| 17 | `GET /v1/accounts/me` | 200 | 22 | `qa-fc56520d-b9ee-4392-8060-dea3e8c203c0` |
| 18 | `GET /v1/accounts/me` | 200 | 11 | `qa-19a08a3b-2307-47a6-92c5-386e5adcbec4` |
| 19 | `GET /v1/accounts/me` | 200 | 13 | `qa-7bf672a7-6721-4e5c-a8a8-8440c1911200` |
| 20 | `GET /v1/accounts/me` | 200 | 11 | `qa-eb567f40-da36-4e8f-a258-cfeb2b0aeae5` |
| 21 | `GET /v1/accounts/me` | 200 | 10 | `qa-946f1708-a209-4668-abd2-ae7b8ecd9f52` |
| 22 | `GET /v1/accounts/me` | 200 | 10 | `qa-159f3feb-8687-4226-a1ac-dc07d81b5c4e` |
| 23 | `GET /v1/accounts/me` | 200 | 13 | `qa-45bec47a-d50a-408b-bfe8-64fd73344465` |
| 24 | `GET /v1/accounts/me` | 200 | 11 | `qa-1af44451-44cd-4c9d-8214-8860c4059dd7` |
| 25 | `GET /v1/accounts/me` | 200 | 8 | `qa-4806a058-9a3a-4751-8079-b4334849d1f2` |
| 26 | `GET /v1/accounts/me` | 200 | 6 | `qa-95d2732d-7029-4468-88ae-1ebe6e41d80d` |
| 27 | `GET /v1/accounts/me` | 200 | 10 | `qa-30a21256-0a9c-469b-92b3-dcee7e5091ac` |
| 28 | `GET /v1/accounts/me` | 200 | 12 | `qa-54aa4a83-12d6-4476-823b-4e804b29340d` |
| 29 | `GET /v1/accounts/me` | 200 | 9 | `qa-ad5e1e5b-fd9b-466f-a170-d1b7459f55ae` |
| 30 | `GET /v1/accounts/me` | 200 | 7 | `qa-5fbd26f3-d734-42c2-a107-eb7498099861` |
| 31 | `GET /v1/accounts/me` | 200 | 13 | `qa-5364d24d-a54d-4cdc-bfa1-db8947158e08` |
| 32 | `GET /v1/accounts/me` | 200 | 9 | `qa-8238fbca-b915-4fd4-a41c-f84e42926ecb` |
| 33 | `GET /v1/accounts/me` | 200 | 10 | `qa-a31ae0a5-73dd-42c2-a0b8-8e83328ab519` |
| 34 | `GET /v1/accounts/me` | 200 | 6 | `qa-0a32c199-e8d5-4895-a827-1e363406517f` |
| 35 | `GET /v1/accounts/me` | 200 | 7 | `qa-38ae709c-af75-4ee2-af0d-36fa42ac9443` |
| 36 | `GET /v1/accounts/me` | 200 | 14 | `qa-7dfe4190-acc5-4b5a-b64d-22e192dd224c` |
| 37 | `GET /v1/accounts/me` | 200 | 9 | `qa-53cec2e1-34ba-4541-b6b8-f858584171bc` |
| 38 | `GET /v1/accounts/me` | 200 | 10 | `qa-9b467678-805b-4956-b95a-a7a22dead724` |
| 39 | `GET /v1/accounts/me` | 200 | 11 | `qa-a31e64e9-72a2-4fd7-a391-075bde513e6c` |
| 40 | `GET /v1/accounts/me` | 200 | 10 | `qa-1515fe2c-c662-4ea9-81f0-9cbda4c78828` |
| 41 | `GET /v1/accounts/me` | 200 | 5 | `qa-108fd023-8504-403a-8ba5-bcb47908f6ab` |
| 42 | `GET /v1/accounts/me` | 200 | 10 | `qa-5b86011f-1c81-4cb4-b135-7bf270474eaf` |
| 43 | `GET /v1/accounts/me` | 200 | 10 | `qa-092ad1d4-3b1d-4c07-b1a3-2bfa74bbbbf1` |
| 44 | `GET /v1/accounts/me` | 200 | 31 | `qa-b53e260b-f98a-40fc-9e3c-3bd664f1e2a9` |
| 45 | `GET /v1/accounts/me` | 200 | 7 | `qa-c8458c7b-a389-4577-9601-ea1ebd8d41ca` |
| 46 | `GET /v1/accounts/me` | 200 | 9 | `qa-0d0ac576-7951-4906-aeb4-27a86228239d` |
| 47 | `GET /v1/accounts/me` | 200 | 10 | `qa-37cc1912-3e63-4c27-a038-ee1434def253` |
| 48 | `GET /v1/accounts/me` | 200 | 14 | `qa-2e31992f-d9b4-441f-bfa3-0474c77efc09` |
| 49 | `GET /v1/accounts/me` | 200 | 11 | `qa-232dcc10-4fe1-449a-997b-5c6ad3e657be` |
| 50 | `GET /v1/accounts/me` | 200 | 6 | `qa-2cc52b1a-086a-4e2c-8e64-a1f8b1d17c32` |
| 51 | `GET /v1/accounts/me` | 200 | 5 | `qa-3f51f6ea-781d-4f5e-9384-760afc8fb5c7` |
| 52 | `GET /v1/accounts/me` | 200 | 5 | `qa-34fb21fe-62f7-48f4-ba5c-7b8ba34034fb` |
| 53 | `GET /v1/accounts/me` | 200 | 5 | `qa-2dfdba0d-9975-4fd3-b342-fd42836606cc` |
| 54 | `GET /v1/accounts/me` | 200 | 4 | `qa-a7ad00ba-650d-4c01-8526-adc7e35e17bc` |
| 55 | `GET /v1/accounts/me` | 200 | 5 | `qa-5d35871e-2cdf-45eb-9a0a-cb2d312d7a27` |
| 56 | `GET /v1/accounts/me` | 200 | 11 | `qa-54089fc6-f1ed-4cfa-9dab-476f722c97fb` |
| 57 | `GET /v1/accounts/me` | 200 | 7 | `qa-3df61d04-a9a5-41c7-a3d2-3e733836c515` |
| 58 | `GET /v1/accounts/me` | 200 | 12 | `qa-14857618-c980-494e-89d0-d914993f71df` |
| 59 | `GET /v1/accounts/me` | 200 | 9 | `qa-e99482e4-8236-4287-8e6c-89c9c48dab10` |
| 60 | `GET /v1/accounts/me` | 200 | 6 | `qa-2bbe479d-e1e4-4da1-ab8d-fb0beeadaf38` |
| 61 | `GET /v1/accounts/me` | 200 | 8 | `qa-a204fb59-9ff6-4570-8915-afbe6f401b6a` |
| 62 | `GET /v1/accounts/me` | 200 | 5 | `qa-39da0bdb-fa5c-4bac-b06a-45f120603d04` |
| 63 | `GET /v1/accounts/me` | 429 | 6 | `qa-38dacce9-c2f7-4d79-a395-201e9723d9d3` |
| 64 | `GET /v1/accounts/me` | 429 | 7 | `qa-560c324c-225c-46f3-a849-b632970a82c1` |
| 65 | `GET /v1/accounts/me` | 429 | 6 | `qa-3aa037b2-eaa8-45b0-b9ec-b7a1acfa0e27` |
| 66 | `GET /v1/accounts/me` | 429 | 5 | `qa-4c08dae5-e99c-40dc-93a3-220388540615` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-072ed9b7-4379-4929-8e66-e1a128d282db` |
| 68 | `GET /v1/accounts/me` | 429 | 4 | `qa-e7abd718-c590-4448-b935-529e5889177b` |
| 69 | `GET /v1/accounts/me` | 429 | 5 | `qa-3db59ba2-4b77-4c68-9425-96da8c7b3902` |
| 70 | `GET /v1/accounts/me` | 429 | 5 | `qa-764d8188-aba8-495a-b6d2-1ca6c88c8dec` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-40644acd-6b21-478a-82f1-47b2b71a5164` |
| 72 | `GET /v1/accounts/me` | 429 | 5 | `qa-974be7ab-3c05-4d89-8a40-15f903b8134f` |
| 73 | `GET /v1/accounts/me` | 429 | 5 | `qa-9647a57b-480d-4d40-8f62-9c4501453982` |
| 74 | `GET /v1/accounts/me` | 429 | 5 | `qa-2bdd7bd0-0c84-455d-8b5e-be47b51cc1fc` |
| 75 | `GET /v1/accounts/me` | 429 | 5 | `qa-ba3e5b0f-03ff-4fcb-b8cf-05ae23f1211a` |
| 76 | `GET /v1/accounts/me` | 429 | 4 | `qa-dba285d4-711d-462a-b96a-dbc21ec41734` |
| 77 | `GET /v1/accounts/me` | 429 | 4 | `qa-e6bad926-e515-4eb0-a354-721db7095abe` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-f9163b7d-7b56-47ce-8caf-b540eaf30565` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-9dc366d7-f2be-416a-9f15-b95266bc18b4` |
| 80 | `GET /v1/accounts/me` | 429 | 4 | `qa-a2a59592-e6a4-4390-9feb-04d2b893592d` |
| 81 | `GET /v1/accounts/me` | 200 | 4 | `qa-97b83846-3670-4ea8-a92e-d348aa1c6784` |
| 82 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-f30e727c-0ca3-4903-8704-7359d4e52220` |
| 83 | `POST /v1/auth/token` | 401 | 4 | `qa-b707dc8a-6670-4cfd-b3cc-234305c951bc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-91e2556f-b32f-4073-ab76-97a6ace6b66a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91e2556f-b32f-4073-ab76-97a6ace6b66a
Content-Type: application/json

--- request body ---
{"handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","password":"****","region":"eu"}

--- response: 201 in 406 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-91e2556f-b32f-4073-ab76-97a6ace6b66a
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
Location: /v1/accounts/qa-4f0fe79bab61
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-502dbf22-e5e1-47bd-bfb9-2ab65eb63bc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-502dbf22-e5e1-47bd-bfb9-2ab65eb63bc8
Content-Type: application/json

--- request body ---
{"handle":"qa-4f0fe79bab61","password":"****"}

--- response: 200 in 64 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-502dbf22-e5e1-47bd-bfb9-2ab65eb63bc8
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-310cc92a-a393-4f0b-9730-e2205b08029b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-310cc92a-a393-4f0b-9730-e2205b08029b
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-310cc92a-a393-4f0b-9730-e2205b08029b
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
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-570b8455-a634-4303-ade8-a6ddbabbb81d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-570b8455-a634-4303-ade8-a6ddbabbb81d
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-570b8455-a634-4303-ade8-a6ddbabbb81d
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
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-b6e3cc74-a9a3-407c-a8e8-c651bc50b91a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6e3cc74-a9a3-407c-a8e8-c651bc50b91a
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6e3cc74-a9a3-407c-a8e8-c651bc50b91a
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
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ab13740-9bd4-48ae-bb3d-b572212e3db2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ab13740-9bd4-48ae-bb3d-b572212e3db2
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ab13740-9bd4-48ae-bb3d-b572212e3db2
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
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-535039f6-5cc1-4cb5-b673-c9296a0bb887

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-535039f6-5cc1-4cb5-b673-c9296a0bb887
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-535039f6-5cc1-4cb5-b673-c9296a0bb887
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-d9deef72-bd5f-4574-b9f0-181088a3745e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9deef72-bd5f-4574-b9f0-181088a3745e
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9deef72-bd5f-4574-b9f0-181088a3745e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-cca0bbe0-18ee-468f-ad66-f9f2481c2155

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cca0bbe0-18ee-468f-ad66-f9f2481c2155
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-cca0bbe0-18ee-468f-ad66-f9f2481c2155
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-603fdd67-b846-4f64-8cdf-e0e740a83f04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-603fdd67-b846-4f64-8cdf-e0e740a83f04
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-603fdd67-b846-4f64-8cdf-e0e740a83f04
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-56a80656-7f6b-4e92-b8ee-6a9024491497

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56a80656-7f6b-4e92-b8ee-6a9024491497
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-56a80656-7f6b-4e92-b8ee-6a9024491497
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-fa34f02a-c2cf-42bb-91a3-e5f06eb448d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa34f02a-c2cf-42bb-91a3-e5f06eb448d6
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa34f02a-c2cf-42bb-91a3-e5f06eb448d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-0137dddc-2f5d-4134-bcaa-7d85f208dd31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0137dddc-2f5d-4134-bcaa-7d85f208dd31
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0137dddc-2f5d-4134-bcaa-7d85f208dd31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-e42fa717-2135-4996-9dd8-2959892f98ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e42fa717-2135-4996-9dd8-2959892f98ec
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e42fa717-2135-4996-9dd8-2959892f98ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-46fe7c57-4811-4597-8c6c-640fab255a3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46fe7c57-4811-4597-8c6c-640fab255a3d
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-46fe7c57-4811-4597-8c6c-640fab255a3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-2f99a138-de97-42fc-8c73-01d56ffbd424

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f99a138-de97-42fc-8c73-01d56ffbd424
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f99a138-de97-42fc-8c73-01d56ffbd424
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-fc56520d-b9ee-4392-8060-dea3e8c203c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc56520d-b9ee-4392-8060-dea3e8c203c0
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc56520d-b9ee-4392-8060-dea3e8c203c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-19a08a3b-2307-47a6-92c5-386e5adcbec4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19a08a3b-2307-47a6-92c5-386e5adcbec4
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-19a08a3b-2307-47a6-92c5-386e5adcbec4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-7bf672a7-6721-4e5c-a8a8-8440c1911200

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bf672a7-6721-4e5c-a8a8-8440c1911200
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7bf672a7-6721-4e5c-a8a8-8440c1911200
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-eb567f40-da36-4e8f-a258-cfeb2b0aeae5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb567f40-da36-4e8f-a258-cfeb2b0aeae5
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb567f40-da36-4e8f-a258-cfeb2b0aeae5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-946f1708-a209-4668-abd2-ae7b8ecd9f52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-946f1708-a209-4668-abd2-ae7b8ecd9f52
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-946f1708-a209-4668-abd2-ae7b8ecd9f52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-159f3feb-8687-4226-a1ac-dc07d81b5c4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-159f3feb-8687-4226-a1ac-dc07d81b5c4e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-159f3feb-8687-4226-a1ac-dc07d81b5c4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-45bec47a-d50a-408b-bfe8-64fd73344465

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45bec47a-d50a-408b-bfe8-64fd73344465
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-45bec47a-d50a-408b-bfe8-64fd73344465
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-1af44451-44cd-4c9d-8214-8860c4059dd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1af44451-44cd-4c9d-8214-8860c4059dd7
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1af44451-44cd-4c9d-8214-8860c4059dd7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-4806a058-9a3a-4751-8079-b4334849d1f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4806a058-9a3a-4751-8079-b4334849d1f2
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4806a058-9a3a-4751-8079-b4334849d1f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-95d2732d-7029-4468-88ae-1ebe6e41d80d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95d2732d-7029-4468-88ae-1ebe6e41d80d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-95d2732d-7029-4468-88ae-1ebe6e41d80d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-30a21256-0a9c-469b-92b3-dcee7e5091ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30a21256-0a9c-469b-92b3-dcee7e5091ac
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-30a21256-0a9c-469b-92b3-dcee7e5091ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-54aa4a83-12d6-4476-823b-4e804b29340d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54aa4a83-12d6-4476-823b-4e804b29340d
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-54aa4a83-12d6-4476-823b-4e804b29340d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-ad5e1e5b-fd9b-466f-a170-d1b7459f55ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad5e1e5b-fd9b-466f-a170-d1b7459f55ae
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad5e1e5b-fd9b-466f-a170-d1b7459f55ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-5fbd26f3-d734-42c2-a107-eb7498099861

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fbd26f3-d734-42c2-a107-eb7498099861
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fbd26f3-d734-42c2-a107-eb7498099861
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-5364d24d-a54d-4cdc-bfa1-db8947158e08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5364d24d-a54d-4cdc-bfa1-db8947158e08
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5364d24d-a54d-4cdc-bfa1-db8947158e08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-8238fbca-b915-4fd4-a41c-f84e42926ecb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8238fbca-b915-4fd4-a41c-f84e42926ecb
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8238fbca-b915-4fd4-a41c-f84e42926ecb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-a31ae0a5-73dd-42c2-a0b8-8e83328ab519

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a31ae0a5-73dd-42c2-a0b8-8e83328ab519
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a31ae0a5-73dd-42c2-a0b8-8e83328ab519
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-0a32c199-e8d5-4895-a827-1e363406517f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a32c199-e8d5-4895-a827-1e363406517f
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a32c199-e8d5-4895-a827-1e363406517f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-38ae709c-af75-4ee2-af0d-36fa42ac9443

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38ae709c-af75-4ee2-af0d-36fa42ac9443
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-38ae709c-af75-4ee2-af0d-36fa42ac9443
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-7dfe4190-acc5-4b5a-b64d-22e192dd224c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dfe4190-acc5-4b5a-b64d-22e192dd224c
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7dfe4190-acc5-4b5a-b64d-22e192dd224c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-53cec2e1-34ba-4541-b6b8-f858584171bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53cec2e1-34ba-4541-b6b8-f858584171bc
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-53cec2e1-34ba-4541-b6b8-f858584171bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-9b467678-805b-4956-b95a-a7a22dead724

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b467678-805b-4956-b95a-a7a22dead724
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b467678-805b-4956-b95a-a7a22dead724
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-a31e64e9-72a2-4fd7-a391-075bde513e6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a31e64e9-72a2-4fd7-a391-075bde513e6c
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a31e64e9-72a2-4fd7-a391-075bde513e6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-1515fe2c-c662-4ea9-81f0-9cbda4c78828

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1515fe2c-c662-4ea9-81f0-9cbda4c78828
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-1515fe2c-c662-4ea9-81f0-9cbda4c78828
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-108fd023-8504-403a-8ba5-bcb47908f6ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-108fd023-8504-403a-8ba5-bcb47908f6ab
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-108fd023-8504-403a-8ba5-bcb47908f6ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-5b86011f-1c81-4cb4-b135-7bf270474eaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b86011f-1c81-4cb4-b135-7bf270474eaf
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b86011f-1c81-4cb4-b135-7bf270474eaf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-092ad1d4-3b1d-4c07-b1a3-2bfa74bbbbf1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-092ad1d4-3b1d-4c07-b1a3-2bfa74bbbbf1
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-092ad1d4-3b1d-4c07-b1a3-2bfa74bbbbf1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-b53e260b-f98a-40fc-9e3c-3bd664f1e2a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b53e260b-f98a-40fc-9e3c-3bd664f1e2a9
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b53e260b-f98a-40fc-9e3c-3bd664f1e2a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-c8458c7b-a389-4577-9601-ea1ebd8d41ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8458c7b-a389-4577-9601-ea1ebd8d41ca
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8458c7b-a389-4577-9601-ea1ebd8d41ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d0ac576-7951-4906-aeb4-27a86228239d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d0ac576-7951-4906-aeb4-27a86228239d
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d0ac576-7951-4906-aeb4-27a86228239d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-37cc1912-3e63-4c27-a038-ee1434def253

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37cc1912-3e63-4c27-a038-ee1434def253
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-37cc1912-3e63-4c27-a038-ee1434def253
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e31992f-d9b4-441f-bfa3-0474c77efc09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e31992f-d9b4-441f-bfa3-0474c77efc09
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e31992f-d9b4-441f-bfa3-0474c77efc09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-232dcc10-4fe1-449a-997b-5c6ad3e657be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-232dcc10-4fe1-449a-997b-5c6ad3e657be
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-232dcc10-4fe1-449a-997b-5c6ad3e657be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-2cc52b1a-086a-4e2c-8e64-a1f8b1d17c32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cc52b1a-086a-4e2c-8e64-a1f8b1d17c32
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cc52b1a-086a-4e2c-8e64-a1f8b1d17c32
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-3f51f6ea-781d-4f5e-9384-760afc8fb5c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f51f6ea-781d-4f5e-9384-760afc8fb5c7
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f51f6ea-781d-4f5e-9384-760afc8fb5c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-34fb21fe-62f7-48f4-ba5c-7b8ba34034fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34fb21fe-62f7-48f4-ba5c-7b8ba34034fb
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-34fb21fe-62f7-48f4-ba5c-7b8ba34034fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-2dfdba0d-9975-4fd3-b342-fd42836606cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dfdba0d-9975-4fd3-b342-fd42836606cc
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2dfdba0d-9975-4fd3-b342-fd42836606cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-a7ad00ba-650d-4c01-8526-adc7e35e17bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7ad00ba-650d-4c01-8526-adc7e35e17bc
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7ad00ba-650d-4c01-8526-adc7e35e17bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-5d35871e-2cdf-45eb-9a0a-cb2d312d7a27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d35871e-2cdf-45eb-9a0a-cb2d312d7a27
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d35871e-2cdf-45eb-9a0a-cb2d312d7a27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-54089fc6-f1ed-4cfa-9dab-476f722c97fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54089fc6-f1ed-4cfa-9dab-476f722c97fb
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-54089fc6-f1ed-4cfa-9dab-476f722c97fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-3df61d04-a9a5-41c7-a3d2-3e733836c515

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3df61d04-a9a5-41c7-a3d2-3e733836c515
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-3df61d04-a9a5-41c7-a3d2-3e733836c515
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-14857618-c980-494e-89d0-d914993f71df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14857618-c980-494e-89d0-d914993f71df
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-14857618-c980-494e-89d0-d914993f71df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-e99482e4-8236-4287-8e6c-89c9c48dab10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e99482e4-8236-4287-8e6c-89c9c48dab10
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e99482e4-8236-4287-8e6c-89c9c48dab10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-2bbe479d-e1e4-4da1-ab8d-fb0beeadaf38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bbe479d-e1e4-4da1-ab8d-fb0beeadaf38
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bbe479d-e1e4-4da1-ab8d-fb0beeadaf38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-a204fb59-9ff6-4570-8915-afbe6f401b6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a204fb59-9ff6-4570-8915-afbe6f401b6a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a204fb59-9ff6-4570-8915-afbe6f401b6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-39da0bdb-fa5c-4bac-b06a-45f120603d04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39da0bdb-fa5c-4bac-b06a-45f120603d04
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-39da0bdb-fa5c-4bac-b06a-45f120603d04
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-38dacce9-c2f7-4d79-a395-201e9723d9d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38dacce9-c2f7-4d79-a395-201e9723d9d3
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-38dacce9-c2f7-4d79-a395-201e9723d9d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-38dacce9-c2f7-4d79-a395-201e9723d9d3"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-560c324c-225c-46f3-a849-b632970a82c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-560c324c-225c-46f3-a849-b632970a82c1
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-560c324c-225c-46f3-a849-b632970a82c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-560c324c-225c-46f3-a849-b632970a82c1"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-3aa037b2-eaa8-45b0-b9ec-b7a1acfa0e27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3aa037b2-eaa8-45b0-b9ec-b7a1acfa0e27
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3aa037b2-eaa8-45b0-b9ec-b7a1acfa0e27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3aa037b2-eaa8-45b0-b9ec-b7a1acfa0e27"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-4c08dae5-e99c-40dc-93a3-220388540615

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c08dae5-e99c-40dc-93a3-220388540615
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c08dae5-e99c-40dc-93a3-220388540615
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4c08dae5-e99c-40dc-93a3-220388540615"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-072ed9b7-4379-4929-8e66-e1a128d282db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-072ed9b7-4379-4929-8e66-e1a128d282db
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-072ed9b7-4379-4929-8e66-e1a128d282db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-072ed9b7-4379-4929-8e66-e1a128d282db"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-e7abd718-c590-4448-b935-529e5889177b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7abd718-c590-4448-b935-529e5889177b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e7abd718-c590-4448-b935-529e5889177b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e7abd718-c590-4448-b935-529e5889177b"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-3db59ba2-4b77-4c68-9425-96da8c7b3902

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3db59ba2-4b77-4c68-9425-96da8c7b3902
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3db59ba2-4b77-4c68-9425-96da8c7b3902
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3db59ba2-4b77-4c68-9425-96da8c7b3902"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-764d8188-aba8-495a-b6d2-1ca6c88c8dec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-764d8188-aba8-495a-b6d2-1ca6c88c8dec
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-764d8188-aba8-495a-b6d2-1ca6c88c8dec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-764d8188-aba8-495a-b6d2-1ca6c88c8dec"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-40644acd-6b21-478a-82f1-47b2b71a5164

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40644acd-6b21-478a-82f1-47b2b71a5164
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40644acd-6b21-478a-82f1-47b2b71a5164
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-40644acd-6b21-478a-82f1-47b2b71a5164"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-974be7ab-3c05-4d89-8a40-15f903b8134f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-974be7ab-3c05-4d89-8a40-15f903b8134f
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-974be7ab-3c05-4d89-8a40-15f903b8134f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-974be7ab-3c05-4d89-8a40-15f903b8134f"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-9647a57b-480d-4d40-8f62-9c4501453982

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9647a57b-480d-4d40-8f62-9c4501453982
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9647a57b-480d-4d40-8f62-9c4501453982
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9647a57b-480d-4d40-8f62-9c4501453982"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-2bdd7bd0-0c84-455d-8b5e-be47b51cc1fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bdd7bd0-0c84-455d-8b5e-be47b51cc1fc
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2bdd7bd0-0c84-455d-8b5e-be47b51cc1fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2bdd7bd0-0c84-455d-8b5e-be47b51cc1fc"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-ba3e5b0f-03ff-4fcb-b8cf-05ae23f1211a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba3e5b0f-03ff-4fcb-b8cf-05ae23f1211a
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba3e5b0f-03ff-4fcb-b8cf-05ae23f1211a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ba3e5b0f-03ff-4fcb-b8cf-05ae23f1211a"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-dba285d4-711d-462a-b96a-dbc21ec41734

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dba285d4-711d-462a-b96a-dbc21ec41734
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dba285d4-711d-462a-b96a-dbc21ec41734
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-dba285d4-711d-462a-b96a-dbc21ec41734"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-e6bad926-e515-4eb0-a354-721db7095abe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6bad926-e515-4eb0-a354-721db7095abe
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e6bad926-e515-4eb0-a354-721db7095abe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e6bad926-e515-4eb0-a354-721db7095abe"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-f9163b7d-7b56-47ce-8caf-b540eaf30565

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9163b7d-7b56-47ce-8caf-b540eaf30565
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9163b7d-7b56-47ce-8caf-b540eaf30565
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f9163b7d-7b56-47ce-8caf-b540eaf30565"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-9dc366d7-f2be-416a-9f15-b95266bc18b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dc366d7-f2be-416a-9f15-b95266bc18b4
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9dc366d7-f2be-416a-9f15-b95266bc18b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9dc366d7-f2be-416a-9f15-b95266bc18b4"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-a2a59592-e6a4-4390-9feb-04d2b893592d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2a59592-e6a4-4390-9feb-04d2b893592d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a2a59592-e6a4-4390-9feb-04d2b893592d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a2a59592-e6a4-4390-9feb-04d2b893592d"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-97b83846-3670-4ea8-a92e-d348aa1c6784

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97b83846-3670-4ea8-a92e-d348aa1c6784
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-97b83846-3670-4ea8-a92e-d348aa1c6784
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
Content-Length: 181

{"id":"acc_ba315be8-c491-4714-bd54-3f3db4b26db0","handle":"qa-4f0fe79bab61","displayName":"QA 4f0fe79bab61","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.674069527Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f30e727c-0ca3-4903-8704-7359d4e52220

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f30e727c-0ca3-4903-8704-7359d4e52220
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f30e727c-0ca3-4903-8704-7359d4e52220
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

## 83. POST /v1/auth/token

```text
#83 POST http://localhost:7070/v1/auth/token
correlation: qa-b707dc8a-6670-4cfd-b3cc-234305c951bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b707dc8a-6670-4cfd-b3cc-234305c951bc
Content-Type: application/json

--- request body ---
{"handle":"qa-4f0fe79bab61","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b707dc8a-6670-4cfd-b3cc-234305c951bc
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b707dc8a-6670-4cfd-b3cc-234305c951bc"}
```
